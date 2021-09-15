/**
 * 
 */
package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.Random;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * @author rodrigo
 *
 */
public class TesteArrayListEquals {

	private static Random rGen = new Random();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		
		Conta c1= new ContaCorrente(rand(1000), rand(1000));
		Conta c2= new ContaCorrente(rand(1000), rand(1000));
		Conta c3= new ContaCorrente(rand(1000), rand(1000));
		Conta c4= new ContaCorrente(rand(1000), rand(1000));
		Conta c5= new ContaCorrente(123, 132);
		Conta c6= new ContaCorrente(123, 132);
		Object c7= new ContaCorrente(123, 132);
		Conta cp = new ContaPoupanca(123, 132);
		Cliente cliente = new Cliente();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		
		System.out.println(lista.contains(cp));
		
		for (Conta c: lista) {
			if (c.equals(cp)) {
				System.out.println("Conta: " + c6 + "é igual a c6\n");
			}
		}
		
//		System.out.println("Tamanho da Lista: " + lista.size() +"\n");
//		lista.forEach(item->System.out.println(item));
//		
//		System.out.println(lista.get(0));
////		System.out.println(lista[0]); Not an Arrays
	}
	
	private static int rand(int max) {
		int n;
		do {
			n = rGen.nextInt(max);
		} while (n < 100);
		return n;
	}

}
