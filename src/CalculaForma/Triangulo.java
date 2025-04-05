package CalculaForma;
import java.util.Scanner;
public class Triangulo {
	int lado, perimetro;
	double area;
	Scanner sc = new Scanner(System.in);
	
	Triangulo(){
		System.out.println("Digite o tamanho do lado do triangulo: ");
		this.lado =sc.nextInt() ;
	}
	public int getPerimetro() {
		perimetro = lado*3;
		return perimetro;
	}
	public double getArea() {
		area = (Math.sqrt(3) / 4) * lado * lado;
		return area;
	}
	
}
