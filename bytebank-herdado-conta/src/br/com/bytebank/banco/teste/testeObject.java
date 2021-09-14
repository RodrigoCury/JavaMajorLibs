package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class testeObject {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("x");
		System.out.println(2);
		System.out.println(2L);
		System.out.println(2.2);
		System.out.println(2.2f);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(0, 0);
		
		// Todas Classes Herdam de Java.lang.Object
		System.out.println(cc);
		
	}

}
