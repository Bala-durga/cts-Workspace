package com.cts.slap.ui;
	import java.time.DateTimeException;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.List;
	import java.util.Scanner;

	import com.cts.slap.exception.StudentLogException;
	import com.cts.slap.model.Student;
	import com.cts.slap.model.StudentLogMenu;
	import com.cts.slap.service.StudentService;
	import com.cts.slap.service.StudentServiceImpl;

	public class StudentLogManagementUI {

		
			private static StudentService sService;
			private static Scanner scan;
			private static DateTimeFormatter dtFormater;

			public static void main(String[] args) {

				try {
					sService = new StudentServiceImpl();
				} catch (StudentLogException e) {
					e.printStackTrace();
				}


				scan = new Scanner(System.in);
				dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				StudentLogMenu menu = null;

				while (menu != StudentLogMenu.QUIT) {

					System.out.println("Choice\tMenu Item");
					System.out.println("===========================");
					for (StudentLogMenu s : StudentLogMenu.values()) {
						System.out.println(s.ordinal() + "\t" + s.name());
					}
					System.out.print("Choice: ");
					int choice = -1;
					if (scan.hasNextInt())
						choice = scan.nextInt();
					else {
						scan.next();
						System.out.println("Pleae choose a choice displayed");
						continue;
					}

					if (choice < 0 || choice >= StudentLogMenu.values().length) {
						System.out.println("Invalid Choice");
					} else {
						menu = StudentLogMenu.values()[choice];
						switch (menu) {
						case ADD:
							doAdd();
							break;
						case LIST:
							doList();
							break;
						case SEARCH:
							doSearch();
							break;
						case REMOVE:
							doRemove();
							break;
						case QUIT:
							System.out.println("Thank You Come Again!");
							break;
						}
					}

				}

				scan.close();
				try {
					sService.persist();
				}catch(StudentLogException s) {
					s.printStackTrace();
				}
			

			}

			private static void doAdd() {
				try {
					Student s = new Student();
					System.out.print("Sid: ");
					s.setSid(scan.next());
					System.out.print("Sname: ");
					s.setSname(scan.next());
					System.out.print("mofDate(dd-MM-yyyy): ");
					String joinDtStr = scan.next();

					try {
						s.setJoinDate(LocalDate.parse(joinDtStr, dtFormater));
					} catch (DateTimeException exp) {
						throw new StudentLogException(
								"Date must be in the format day(dd)-month(MM)-year(yyyy)");
					}
					System.out.print("Fee: ");
					if (scan.hasNextDouble())
						s.setFee(scan.nextDouble());
					else {
						scan.next();
						throw new StudentLogException("Fee is a number");
					}

					String sid = sService.add(s);
					System.out.println("Student is Added with code: " +sid);
				} catch (StudentLogException exp) {
					System.out.println(exp.getMessage());
				}
			}

			private static void doList() {
				List<Student> s;
				try {
					s = sService.getAll();
					if (s.size() == 0) {
						System.out.println("No Students To display");
					} else {
						for (Student mo : s)
							System.out.println(mo);
					}
				} catch (StudentLogException exp) {
					System.out.println(exp.getMessage());
				}
			}

			private static void doSearch() {
				System.out.print("Sid: ");
				String sid = scan.next();

				try {
					Student s = sService.get(sid);
					if (s != null) {
						System.out.println(s);
					} else {
						System.out.println("No Such Student");
					}
				} catch (StudentLogException exp) {
					System.out.println(exp.getMessage());
				}
			}

			private static void doRemove() {
				System.out.print("Sid: ");
				String sid = scan.next();
				try {
					boolean isDone = sService.delete(sid);
					if (isDone) {
						System.out.println("Student is Deleted");
					} else {
						System.out.println("No Such Student");
					}
				} catch (StudentLogException exp) {
					System.out.println(exp.getMessage());
				}
			}

}
