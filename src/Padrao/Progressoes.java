package Padrao;

import javax.swing.JOptionPane;

public class Progressoes {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite em seguida, o termo da PA e PG que quer calcular, " +
                "a razão da progressão e o primeiro termo.");

        int paInteiro = lerInteiro("Digite o termo das progressões a serem calculadas:");
        int primeiroInteiro = lerInteiro("Digite o primeiro elemento:");
        int razaoInteiro = lerInteiro("Digite a razão da progressão:");

        ProgressaoAritmetica progArit = new ProgressaoAritmetica(paInteiro, razaoInteiro, primeiroInteiro);
        ProgressaoGeometrica progGeo = new ProgressaoGeometrica(paInteiro, razaoInteiro, primeiroInteiro);

        int resultado1 = progArit.calcularPA();
        double resultado2 = progGeo.calcularPG();

        String mensagem = "Resultado da PA: " + resultado1 + "\n" +
                          "Resultado da PG: " + resultado2;

        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static int lerInteiro(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }
}

class ProgressaoAritmetica {
    private int n, r, primeiroTermo;

    public ProgressaoAritmetica(int n, int r, int primeiroTermo) {
        this.n = n;
        this.r = r;
        this.primeiroTermo = primeiroTermo;
    }

    public int calcularPA() {
        return primeiroTermo + (n - 1) * r;
    }
}

class ProgressaoGeometrica {
    private double n, q, primeiroTermo;

    public ProgressaoGeometrica(double n, double q, double primeiroTermo) {
        this.n = n;
        this.q = q;
        this.primeiroTermo = primeiroTermo;
    }

    public double calcularPG() {
        return primeiroTermo * Math.pow(q, n - 1);
    }
}
