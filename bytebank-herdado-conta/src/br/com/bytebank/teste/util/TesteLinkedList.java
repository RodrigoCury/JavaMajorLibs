/**
 * 
 */
package br.com.bytebank.teste.util;

import java.util.LinkedList;
import java.util.Random;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * @author rodrigo
 *
 */
public class TesteLinkedList {

	private static Random rGen = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Conta> lista = new LinkedList<Conta>();

		for (int i = 0; i < 5; i++) {
			lista.add(new ContaCorrente(rand(1000), rand(1000)));
		}
		
		System.out.println("Tamanho da Lista: " + lista.size() +"\n");
		lista.forEach(item->System.out.println(item));
		
		System.out.println(lista.get(0));
//		System.out.println(lista[0]); Not an Arrays
	}
	
	private static int rand(int max) {
		int n;
		do {
			n = rGen.nextInt(max);
		} while (n < 100);
		return n;
	}

}
