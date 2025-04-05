package Palavras;
public class Palindromo {
	//Classe que verifica se uma palavra eh palindromo
	//e conta o numero de vogais
	//e inverte a palavra
	//e retorna a palavra original
	String palavra;
	
	public Palindromo(String pal) {
		palavra = pal;
	}
	protected boolean verificaPalindromo() {
		String contrario = "";
		for(int i = palavra.length()-1; i>=0; i--) {
			contrario += palavra.charAt(i);
		}
		return palavra.equals(contrario);
	}
	protected String getPalavra() {
		return palavra;
	}
	protected String invertePalavra() {
		String invertida = "";
		for(int i = palavra.length()-1; i >=0; i--) {
			invertida += palavra.charAt(i);
		}
		return invertida;
	}
	int contaVogais() {
		String vogais = "aeiouAEIOU";
		int nvogais = 0;
		for(int i = 0; i<palavra.length();i++) {
			if(vogais.indexOf(palavra.charAt(i))!= -1) {
				nvogais++;
			}
		}
		return nvogais;
	}
}
