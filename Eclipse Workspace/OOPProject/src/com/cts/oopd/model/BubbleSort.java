package com.cts.oopd.model;
public class BubbleSort implements ISort{
	@Override
	public void sortData(int []a) {
		int i,j,temp;
		System.out.println("sorting is done using bubble sort");
		for(i=0;i<a.length;i++)
			for(j=i;j<a.length;j++)
				if(a[i]>a[j+1]) {
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
	}
}
