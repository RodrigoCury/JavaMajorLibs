package br.com.bytebank.banco.teste;

import java.util.Arrays;
import java.util.List;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
		int[] idades = new int[5];
		for (int i = 0; i < 5; i++) {
			idades[i] = i *5;
		}
		
//		System.out.println(idades);
//		
//		for (int i: idades) {
//			System.out.println(i);
//		}
//		
//		for (int i = 0; i < idades.length; i++)
//			System.out.println(idades[i]);
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		
		lista.forEach(System.out::println);
		lista.forEach(item->System.out.println(item*2));
		lista.forEach(TesteArrayPrimitivos::multiply);
		
//		for (String s: args) {
//			for(char c: s.toCharArray()) {
//				System.out.println(c);
//			}
//			System.out.println("");
//		}

	}
	
	static void multiply(Integer i) {
		System.out.println(i * 25);
	}

}
