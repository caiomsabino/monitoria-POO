package Palavras;

public class Principal {

	public static void main(String[] args) {
		Palindromo palavra1;
		palavra1 = new Palindromo("ovo"); //construtor alternativo
		
		System.out.println("A palavra "+ palavra1.getPalavra()+" eh palindromo? "+palavra1.verificaPalindromo());
		System.out.println("A palavra "+palavra1.getPalavra()+" possui "+palavra1.contaVogais()+
				" vogais, e invertida fica "+ palavra1.invertePalavra());

	}

}
