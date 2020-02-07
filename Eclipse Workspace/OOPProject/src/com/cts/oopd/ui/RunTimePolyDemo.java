package com.cts.oopd.ui;
interface SmartPh{
	void color();
	void version();
}
 class Samsung implements SmartPh{
	@Override
     public void color() {
		System.out.println("black");
	}
	@Override
	public void version() {
		System.out.println("oreo");
	}
	
	
}
class Vivo implements SmartPh{
	@Override
	public void color() {
		System.out.println("black");
	}
	@Override
	public void version() {
		System.out.println("oreo");
	}
	public void price() {
		System.out.println("23000");
		
	}
}

public class RunTimePolyDemo {

	public static void main(String[] args) {
		SmartPh sp[]=new SmartPh[3];
		sp[0]=new Vivo();
		sp[1]=new Samsung();
		sp[2]=new Vivo();
		for(SmartPh value:sp) {
			value.color();
			value.version();
			if(value instanceof Vivo) {
				((Vivo)value).price();
			}
		}
		
		
		
	}

}
