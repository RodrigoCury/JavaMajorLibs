package br.com.bytebank.banco.teste;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferenciasV2 {

	public static void main(String[] args) {
		
		Random rGen = new Random();
		
		Conta[] contas = new Conta[5];
		
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
			
			// Random Account Number and Agency cant be smaller than 100
			do {
				ns[0] = rGen.nextInt(1000);
				ns[1] = rGen.nextInt(1000);
			} while ((ns[0] < 100) || (ns[1] < 100));
			
			// Randomly select a Type
			int contaType = rGen.nextInt(2);
			
			if (contaType == 0)
				contas[i] = new ContaCorrente(ns[0], ns[1]);
			else
				contas[i] = new ContaPoupanca(ns[0], ns[1]);
		}
		
		listArgsPrint(contas);
		
	}
	
	private static void spreadPrint(Conta...cc) {
		System.out.println("Spread");
		for (Conta ccl: cc) {
			System.out.println(ccl);
		}
	}

	private static void argsPrint(Conta[] cc) {
		System.out.println("Args");
		for (Conta ccl: cc) {
			System.out.println(ccl);
		}
	}
	
	private static void listArgsPrint(Conta[] cc) {
		System.out.println("List Args");
		List<Conta> ls = Arrays.asList(cc);
		ls.forEach(System.out::println);
	}

	private static void listSpreadPrint(Conta...cc) {		
		System.out.println("List Spread");
		List<Conta> ls = Arrays.asList(cc);
		ls.forEach(System.out::println);
	}

}
