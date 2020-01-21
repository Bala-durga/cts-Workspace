package com.cts.oopd.ui;
import java.util.Random;
import com.cts.oopd.model.BubbleSort;
import com.cts.oopd.model.GenericSort;
import com.cts.oopd.model.ISort;

public class InterfaceClient {

	public static void main(String[] args) {
		int [] a=new int[10];
		Random random=new Random();
		for(int i=0;i<10;i++) {
			a[i]=random.nextInt(1000);
		}
		System.out.println(".............");
		ISort sort;
		sort=new GenericSort();
		sort=new BubbleSort();
		//sort.sortData();
		for(int value:a) {
			System.out.println(value);
		}
		
		}
	}


