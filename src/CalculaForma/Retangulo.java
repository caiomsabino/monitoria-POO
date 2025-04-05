package CalculaForma;
import java.util.Scanner;
public class Retangulo {
	int l1, l2;
	int area, perimetro;
	Scanner sc = new Scanner(System.in);
	
	Retangulo(){
		System.out.println("Digite o tamanho do primeiro lado: ");
		this.l1 = sc.nextInt();
		System.out.println("Digite o tamanho do segundo lado: ");
		this.l2 = sc.nextInt();
	}
	public int getArea() {
		area = l1*l2;
		return area;
	}
	public int getPerimetro() {
		perimetro = 2*l1 + 2*l2;
		return perimetro;
	}
}	
