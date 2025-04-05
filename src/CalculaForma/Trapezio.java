package CalculaForma;
import java.util.Scanner;
public class Trapezio {
	int b1, b2, area, altura;
	double perimetro;
	double hipotenusa;
	Scanner sc = new Scanner(System.in);
	
	Trapezio(){
		System.out.println("Digite o tamanho da base menor: ");
		this.b1 = sc.nextInt();
		System.out.println("Digite o tamanho da base maior: ");
		this.b2 = sc.nextInt();
		System.out.println("Digite o tamanho da altura do trapezio: ");
		this.altura = sc.nextInt();
		
		getHipotenusa();
		sc.close();
	}
	private void getHipotenusa() {
		int dif = (b2 - b1)/2;
		hipotenusa = Math.sqrt(Math.pow(dif, 2) * Math.pow(altura, 2));
	}
	public double getPerimetro() {
		perimetro = b1+b2+2*hipotenusa;
		return perimetro;
	}
	public int getArea() {
		area = ((b1+b2)*altura)/2;
		return area;
	}
}
