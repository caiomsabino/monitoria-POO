package Padrao;

import javax.swing.JOptionPane;

public class CalculoMatriz {
    public static void main(String[] args) {
        // Solicita as dimensões da primeira matriz
        int linhas1 = lerInteiro("Digite o número de linhas da primeira matriz:");
        int colunas1 = lerInteiro("Digite o número de colunas da primeira matriz:");
        Matriz matriz1 = new Matriz(linhas1, colunas1);
        matriz1.lerMatriz("Digite os elementos da primeira matriz:");

        // Solicita as dimensões da segunda matriz
        int linhas2 = lerInteiro("Digite o número de linhas da segunda matriz:");
        int colunas2 = lerInteiro("Digite o número de colunas da segunda matriz:");
        Matriz matriz2 = new Matriz(linhas2, colunas2);
        matriz2.lerMatriz("Digite os elementos da segunda matriz:");

        // Verifica se a multiplicação é possível
        if (matriz1.getColunas() == matriz2.getLinhas()) {
            // Realiza a multiplicação
            Matriz matrizResultante = matriz1.multiplicar(matriz2);
            JOptionPane.showMessageDialog(null, "Matriz resultante da multiplicação:\n" + matrizResultante);

            // Calcula e exibe a transposta da matriz resultante
            Matriz transposta = matrizResultante.transpor();
            JOptionPane.showMessageDialog(null, "Transposta da matriz resultante:\n" + transposta);
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível multiplicar essas matrizes.");
        }
    }

    private static int lerInteiro(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }
}

class Matriz {
    private int[][] elementos;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void lerMatriz(String mensagem) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem + " Posição [" + i + "][" + j + "]:"));
            }
        }
    }

    public Matriz multiplicar(Matriz outra) {
        if (this.colunas != outra.linhas) {
            JOptionPane.showMessageDialog(null, "O tamanho de colunas da primeira"+
            " e linhas da segunda precisa ser igual.");
            return null;
        }

        Matriz resultante = new Matriz(this.linhas, outra.colunas);

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                for (int k = 0; k < this.colunas; k++) {
                    resultante.elementos[i][j] += this.elementos[i][k] * outra.elementos[k][j];
                }
            }
        }

        return resultante;
    }

    public Matriz transpor() {
        Matriz transposta = new Matriz(this.colunas, this.linhas);

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                transposta.elementos[j][i] = this.elementos[i][j];
            }
        }

        return transposta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                sb.append(elementos[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
