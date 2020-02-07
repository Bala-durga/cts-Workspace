package com.cts.oopd.ui;
class Some{
	void work(double val) {
		System.out.println("double");
	}
	void work(Integer val) {
		System.out.println("integer");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var=6;
		new Some().work(var);

	}

}
