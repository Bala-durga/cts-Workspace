 package com.cts.oopd.Collection.ui;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> name=new ArrayList<>();
		String nam=null;
		while(true) {
			System.out.println("enter name:");
			nam=sc.next();
			if(nam.contentEquals("end")) {
				break;
			}
			name.add(nam);
		}
		for(String data:name) {
			System.out.println(data);
		}
		}
}
