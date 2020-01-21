package com.cts.oopd.Collection.ui;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Numbers {

	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedWriter bw=null;
		ArrayList<String> al=new ArrayList<String>();
		try {
			FileReader fr=new FileReader("numbers.txt");
		    br=new BufferedReader(fr);
			String data=br.readLine();
			while(data !=null) {
				System.out.println("enter filename");
				al.add(data);
				data=br.readLine();
			}
			Collections.sort(al);
			FileWriter fw=new FileWriter("output.txt");
			bw=new BufferedWriter(fw);
			for(String line:al) {
				fw.write(line);
			}
		}catch(IOException excep) {
			System.out.println("could not read file");
		}
		}
	}
