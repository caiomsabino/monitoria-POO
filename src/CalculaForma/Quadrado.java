package CalculaForma;
import java.util.Scanner;
public class Quadrado {
	int lado, area, perimetro;
	Scanner sc = new Scanner(System.in);
	Quadrado(){
		System.out.println("Digite o tamanho do lado do quadrado");
		this.lado = sc.nextInt();
	}
	public int getArea() {
		area = lado*lado;
		return area;
	}
	public int getPerimetro() {
		perimetro = lado*4;
		return perimetro;
	}
}
