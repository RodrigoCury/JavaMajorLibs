/**
 * 
 */
package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * @author rodrigo
 *
 */
public class TesteList {

	private static Random rGen = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Conta> lista = new Vector<Conta>(); // Thread Safe // Multiplas threads podem trabalhar no mesmo Array
//		List<Conta> lista = new Vector<Conta>();
//		Collection<Conta> lista = new Vector<Conta>();

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
