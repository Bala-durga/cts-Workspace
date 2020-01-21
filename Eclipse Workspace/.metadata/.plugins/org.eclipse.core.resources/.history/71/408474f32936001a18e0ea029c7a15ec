package com.cts.oopd.model;
import java.util.*;
public class ArrayListDemo{

     public static void main(String []args)throws Exception{
         ArrayList<String> al=new ArrayList<String>();
         int ch,i;
         String e;
         Scanner sc=new Scanner(System.in);
         System.out.println("1:ADD");
         System.out.println("2:REMOVE");
         System.out.println("3:DISPLAY");
         System.out.println("4:GET");
         System.out.println("5:INDEXOF");
         System.out.println("6:LASTINDEXOF");
         System.out.println("7:GETFIRST");
         System.out.println("8:GETLAST");
         System.out.println("9:ADDFIRST");
         System.out.println("10:ADDLAST");
         System.out.println("11:ITERATOR");
         System.out.println("12:ADD ELEMENT AT A POSITION");
         System.out.println("13:CLEAR");
         System.out.println("14:IS EMPTY");
         System.out.println("15:SIZE");
         System.out.println("16:CONTAINS");
         System.out.println("enter your choice");
         switch(ch)
         {
             case 1:System.out.println("enter ele to add");
                    e=sc.next();
                    al.add(e);
                    System.out.println("element added is"+e);
                    break;
             case 2:System.out.println("enter ele to remove");
                    e=sc.next();
                    al.remove(e);
                    System.out.println("element removed is"+e);
                    break;        
             case 3:System.out.println("elements in an array list are");
                    System.out.println(al);
                    break;        
             case 4:System.out.println("enter index to get the element");
                    i=sc.nextInt();
                    System.out.println(al.get(i));
                    break;
             case 5:System.out.println("enter ele to find the index");
                    e=sc.next();
                    System.out.println(al.indexOf(e));
                    break;
             case 6:System.out.println("enter ele to find last index");
                    e=sc.next();
                    System.out.println(al.lastIndexOf(e));
                    break;
             case 7:System.out.println("retrive first element");
                    System.out.println(al.getFirst());
                    break;
             case 8:System.out.println("retrive last element");
                    System.out.println(al.getLast());
                    break;
             case 9:System.out.println("enter ele to add first");
                    e=sc.next();
                    al.addFirst(e);
                    System.out.println("element added is"+e);
                    break;
             case 10:System.out.println("enter ele to add last");
                    e=sc.next();
                    al.addLast(e);
                    System.out.println("element added is"+e);
                    break;
             case 11:System.out.println("elements in Array list are");
                     Iterator it=al.iterator();
                     while(it.hasNext())
                     System.out.println(it.next());
                    break;
             case 12:System.out.println("adding ele at a perticular position");
                     i=sc.nextInt();
                     System.out.println("enter ele");
                     e=sc.next();
                     al.add(i,e);
                    System.out.println(e);
                    break;
             case 13:System.out.println("clear");
                    al.clear();
                    System.out.println(e);
                    break;
             case 14:System.out.println("is empty");
                     if(al.isEmpty())
                     System.out.println("empty");
                     else
                     System.out.println("not empty");
                     break;
             case 15:System.out.println("size of the array list is"+al.size());
                     System.out.println("");
                     break;
             case 16:System.out.println("enter ele to search");
                    e=sc.next();
                    if(al.contains(e))
                    System.out.println("contains ele"+e);
                    else
                    System.out.println("no such ele");
                    break;
             default:System.exit(0);
         }


}
}
