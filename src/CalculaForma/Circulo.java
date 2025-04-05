package CalculaForma;
import java.util.Scanner;
public class Circulo {
	int raio;
	double perimetro, area;
	Scanner sc = new Scanner(System.in);
	
	Circulo(){
		System.out.println("Digite o tamanho do raio: ");
		this.raio = sc.nextInt();
	}
	public double getPerimetro() {
		perimetro = Math.PI*2*raio;
		return perimetro;
	}
	public double getArea() {
		area = Math.PI*raio*raio;
		return area;
	}
}
