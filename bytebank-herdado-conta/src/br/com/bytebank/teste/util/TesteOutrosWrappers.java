package br.com.bytebank.teste.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		Integer idade = Integer.valueOf("1"); // autoboxing
		System.out.println(idade.intValue());  // unboxing
		
		Double dRef = Double.valueOf(2.3);  // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.FALSE; // autoboxing
		System.out.println(bRef.booleanValue()); // unboxing
	
	
		Number nRef = Float.valueOf(12.9f);
		System.out.println(nRef.floatValue());
		System.out.println(nRef.doubleValue());
		System.out.println(nRef.intValue());
		System.out.println(nRef.longValue());
	}
	

}
