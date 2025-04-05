package CalculaForma;
import java.util.Scanner;
public class Calculadora {
//Classe Calculadora que possui o metodo main, onde o usuario pode escolher entre as figuras geometricas
//Quadrado, Retangulo, Triangulo, Circulo e Trapézio
//utiliza a classe Scanner para ler os dados do usuario e calcula a area e o perimetro de cada figura geometrica
//de acordo com a escolha do usuario.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		do {
			System.out.println("Digite a figura que quer informacoes: \n"+
							"1: Quadrado; \n"
							+"2: Retangulo; \n"
							+"3: Triangulo; \n"
							+"4: Circulo; \n"
							+ "5: Trapézio; \n"
							+"0: Sair. ");
			entrada = sc.nextInt();
			switch(entrada) {
			case 0:
				System.out.println("Programa encerrado. ");
				sc.close();
				return;
	
			case 1:
				Quadrado quadrado = new Quadrado();
				System.out.println("A area eh: "+quadrado.getArea());
				System.out.println("O perimetro eh: "+quadrado.getPerimetro());
				break;
	
			case 2:
				Retangulo retangulo = new Retangulo();
				System.out.println("A area eh: "+retangulo.getArea());
				System.out.println("O perimetro do eh: "+retangulo.getPerimetro());
				break;
			case 3:
				Triangulo triangulo = new Triangulo();
				System.out.println("A area eh: "+triangulo.getArea());
				System.out.println("O perimetro eh: "+triangulo.getPerimetro());
				break;
			case 4:
				Circulo circulo = new Circulo();
				System.out.println("A area eh: "+circulo.getArea());
				System.out.println("O perimetro eh: "+circulo.getPerimetro());
				break;
			case 5:
				Trapezio trapezio = new Trapezio();
				System.out.println("A area eh: "+trapezio.getArea());
				System.out.println("O perimetro eh: "+trapezio.getPerimetro());
				break;
			default:
				System.out.println("Opção inválida.");
				return;
			}
		}
		while(entrada!=0);
		sc.close();
			
	}

}
