package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.NumeroDaContaComparator;

public class TesteOrdenar {
	
	private static Random rGen = new Random();
	
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta c1= new ContaCorrente(rand(1000), rand(1000));
		Conta c2= new ContaCorrente(rand(1000), rand(1000));
		Conta c3= new ContaCorrente(rand(1000), rand(1000));
		Conta c4= new ContaCorrente(rand(1000), rand(1000));
		Conta c5= new ContaCorrente(123, 132);
		Conta c6= new ContaCorrente(123, 132);
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		
		System.out.println(lista);
		
//		lista.sort(new NumeroDaContaComparator());
//		Collections.sort(lista, new NumeroDaContaComparator());
//		Collections.sort(lista);
		
		Collections.sort(lista, new Comparator<Conta>() { // Classe Anônima
			@Override
			public int compare(Conta o1, Conta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
		});
		
		System.out.println(lista);
	}
	
	private static int rand(int max) {
		int n;
		do {
			n = rGen.nextInt(max);
		} while (n < 100);
		return n;
	}
}
