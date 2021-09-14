package br.com.bytebank.banco.teste;

public class testaString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String nome = "Rodrigo Cury"; // Object Literal // Optimized 
		// OU
		String outro = new String("Rodrigo Cury");

		nome = nome.replace("R", "r");
		
		System.out.println(nome);
	}

}
