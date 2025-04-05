package JavaBasics;
import javax.swing.JOptionPane;
public class Aval_antiga {
//o objetivo dessa questão era saber o que sairia no print
//e o que sairia no JOptionPane, o que foi feito com sucesso
//e o que não foi feito com sucesso foi a questão de saber o que aconteceria se o valor de y fosse 0,
	public static void main(String[] args) {
		
		int[] t;
		int y;
		float x,z;
		String strX, strY, strZ;
		
		strX = JOptionPane.showInputDialog("Informe o valor de x: ");
		x = Float.parseFloat(strX);
		strY = JOptionPane.showInputDialog("Informe o valor de y: ");
		y = Integer.parseInt(strY);
		strZ = JOptionPane.showInputDialog("Informe o valor de z: ");
		z = Float.parseFloat(strZ);
		
		t = compute(x, y, z);
		print(t);
		print(t, true);
	}
	static int[] compute(float  l, int m, float n) {
		int x[] = new int[m];
		
		for(int i = 0; i<m; i++) {
			x[i] = (int)l + i*(int)n;
		}
		return x;
	}
	static void print(int[] t, boolean b) {
		String m = "";
		for(int i = 0; i<t.length;i++) {
			if(b) {
				if(i%2==0) {
					m+= t[i] +",";
				}
				else {
					m+=i+",";
				}
			}
		}
		JOptionPane.showMessageDialog(null, m);
	}
	static void print(int[] t ) {
		String m = "";
		for(int i = 0;i<t.length; i++) {
			m+= t[i] + ",";
		}
		JOptionPane.showMessageDialog(null, m);
	}

}
