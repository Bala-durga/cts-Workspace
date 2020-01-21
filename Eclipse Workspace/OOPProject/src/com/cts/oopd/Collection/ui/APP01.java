package com.cts.oopd.Collection.ui;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
public class APP01 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter filename");
			String filename=sc.nextLine();
			FileReader fr=new FileReader(filename);
			int ch;
			while(true) {
				ch=fr.read();
				if(ch==-1)
					break;
				System.out.println((char)ch);
			}
		}catch(FileNotFoundException excep) {
			System.out.println("no such file");
			}catch(IOException excep) {
				System.out.println("could not read file");
		}
	}
}
