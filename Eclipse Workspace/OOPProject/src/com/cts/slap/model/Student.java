package com.cts.slap.model;

	import java.io.Serializable;
	import java.time.LocalDate;

	public class Student implements Serializable {
		
		
		private String sid;
		private String sname;
		private LocalDate joinDate;
		private double fee;
		
	    public Student() {
	    
	    }

		public Student(String sid, String sname, LocalDate joinDate, double fee) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.joinDate = joinDate;
			this.fee = fee;
		}

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public LocalDate getJoinDate() {
			return joinDate;
		}

		public void setJoinDate(LocalDate joinDate) {
			this.joinDate = joinDate;
		}

		public double getFee() {
			return fee;
		}

		public void setFee(double fee) {
			this.fee = fee;
		}

		@Override
		public String toString() {
			StringBuilder output = new StringBuilder("Sid : ");
			output.append(sid);
			output.append("\tSname : ");
			output.append(sname);
			output.append("\tJoin Date :");
			output.append(joinDate);
			output.append("\tFee : ");
			output.append(fee);
			return output.toString();
			
			
		}
		
	}
	    
	    


