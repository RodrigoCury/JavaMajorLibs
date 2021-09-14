package br.com.bytebank.banco.teste;

public class testaString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String nome = "Rodrigo Cury"; // Object Literal // Optimized 
		// OU
		String outro = new String("Rodrigo Cury");

		char R = 'R';
		char r = 'r';

		nome = nome.replace(R, r);		
		nome = nome.replace("rod", "");

		System.out.println(nome);
		
		System.out.println(nome.charAt(1));
		System.out.println(nome.indexOf("Cury"));
		System.out.println(nome.substring(1));
		System.out.println(nome.substring(2, 6));
		System.out.println(nome);
		System.out.println(nome.length());
		nome = "       " + nome;
		System.out.println(nome);
		System.out.println(nome.trim());
		
		for (char c: nome.trim().toCharArray()) {
			System.out.println(c);
		}
	}

}
