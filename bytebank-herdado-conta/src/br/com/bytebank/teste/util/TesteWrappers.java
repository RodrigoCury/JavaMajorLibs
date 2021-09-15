package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
	public static void main(String[] args) {
		int[] idades = new int[5];
		List<Integer> numeros = new ArrayList<Integer>();

		String str = "10";
		numeros.add(Integer.parseInt(str)); // Devolve primitivo
		numeros.add(Integer.valueOf(str)); // devolve referencia
		
		System.out.println(numeros.get(0) == numeros.get(1));
		
//		String str1 = "av";
//		System.out.println(Integer.valueOf(str1)); // Throws NumberFormatException
		
		int idade = 29;
		numeros.add(idade); // Auto boxing
		
		Integer idadesRef = new Integer(20); // Deprecated
		numeros.add(idadesRef); // Deprecated
		
		idades[0] = idade;
		
		System.out.println(numeros);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		Integer n = 12;
	}
}
