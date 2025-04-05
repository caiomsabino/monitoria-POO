package JavaBasics;

import java.util.Scanner;

public class Binario {
    //transforma número decimal em binário
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		binario(n);
	}
	static void binario(int valor){
		String resposta = "";
		if(valor==0) {
			System.out.println(valor);
		}
		else
		while(valor != 0) {
				resposta = valor%2 + resposta;
				valor /= 2;
			}
		System.out.println(resposta);
		}	
}
