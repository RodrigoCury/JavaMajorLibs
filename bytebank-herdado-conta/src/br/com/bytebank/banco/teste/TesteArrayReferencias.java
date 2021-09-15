package br.com.bytebank.banco.teste;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Random rGen = new Random();
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		int[] ns = new int[2];
		
		// Does NOT work
//		for (ContaCorrente cc: contas) {
//			do {
//				ns[0] = rGen.nextInt(1000);
//				ns[1] = rGen.nextInt(1000);
//			} while ((ns[0] < 100) || (ns[1] < 100));
//			
//			// HERE
//			cc = new ContaCorrente(ns[0], ns[1]);
//		}	
		
		for (int i = 0; i < contas.length; i++) {
			do {
				ns[0] = rGen.nextInt(1000);
				ns[1] = rGen.nextInt(1000);
			} while ((ns[0] < 100) || (ns[1] < 100));
			
			contas[i] = new ContaCorrente(ns[0], ns[1]);
		}
		
		listArgsPrint(contas);
		
	}
	
	static void spreadPrint(ContaCorrente ...cc) {
		System.out.println("Spread");
		for (ContaCorrente ccl: cc) {
			System.out.println(ccl);
		}
	}

	static void argsPrint(ContaCorrente[] cc) {
		System.out.println("Args");
		for (ContaCorrente ccl: cc) {
			System.out.println(ccl);
		}
	}
	
	static void listArgsPrint(ContaCorrente[] cc) {
		System.out.println("List Args");
		List<ContaCorrente> ls = Arrays.asList(cc);
		ls.forEach(System.out::println);
	}

	static void listSpreadPrint(ContaCorrente ...cc) {		
		System.out.println("List Spread");
		List<ContaCorrente> ls = Arrays.asList(cc);
		ls.forEach(System.out::println);
	}

}
