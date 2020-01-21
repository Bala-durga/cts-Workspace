package com.cts.oopd.ui;
import com.cts.oopd.model.Circle;
import com.cts.oopd.model.Rectangle;
import com.cts.oopd.model.Shape;
public class AbstractClient {
	public static void main(String [] args) {
		Rectangle rectangle=new Rectangle(10,5);
		System.out.println(rectangle);
		Circle circle=new Circle(3);
		System.out.println(circle);
		Shape shape;
		shape=new Rectangle(10,5);
		System.out.println(rectangle);
		shape=new Circle(3);
		System.out.println(circle);
	}
}
