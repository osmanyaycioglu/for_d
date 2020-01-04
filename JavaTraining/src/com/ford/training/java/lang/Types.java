package com.ford.training.java.lang;

public class Types {
	private Integer intVal;
	private static Integer intValStatic;
	
	public  static int test() {
		return intValStatic * 20;
	}
	
	public static void main(String[] args) {
		
		Types.test();
		
		byte f = 10;
		byte g = (byte)0x80;
		byte h = (byte)129;
		System.out.println("Byte g : " + g);
		System.out.println("Byte h : " + h);
		
		short e = 10;
		int a = 10;
		long b = 10000000000L;
		
		float c = 1.2F;
		double d = 1.2D;
		
		char i = 100;
		char j = 'a';
		
		Integer oa = new Integer(10);
		Integer oa2 = 10;
		Integer oa3 ;
		oa3 = 20;
		System.out.println("OA3 : " + oa3);
		
		Long ob = new Long(100);
		Long ob2 = 100L;
		Long ob3 = (long)100;
		
		String str = "osman";
		String str1 = "100";
		
		int sonucInt = Integer.parseInt(str1);
		
	}
}














