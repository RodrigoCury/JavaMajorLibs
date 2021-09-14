package br.com.rodrigocury.bytebank;

import br.com.bytebank.banco.modelo.*;

public class testeLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c = new ContaCorrente(123, 123);
		
		c.deposita(1234);
		
		System.out.println(c.getSaldo());
	}

}
