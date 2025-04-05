package Padrao;
import javax.swing.JOptionPane;
import java.util.Arrays;
// O objetivo é criar um vetor, ordená-lo em ordem crescente e decrescente e exibir os resultados.
// O código utiliza a classe JOptionPane para ler os dados do usuário e exibir os resultados.
public class MainVetores {
    public static void main(String[] args) {
        // Lê o tamanho do vetor
        int n = lerInteiro("Digite o tamanho do vetor:");

        // Cria o vetor com valores informados pelo usuário
        Vetor vetorOriginal = Vetor.criaVetor(n);

        // Ordena o vetor em ordem crescente e decrescente
        Vetor vetorCrescente = vetorOriginal.ordenarCrescente();
        Vetor vetorDecrescente = vetorOriginal.ordenarDecrescente();

        // Apresenta os vetores
        JOptionPane.showMessageDialog(null, "Vetor Original: " + vetorOriginal);
        JOptionPane.showMessageDialog(null, "Vetor em Ordem Crescente: " + vetorCrescente);
        JOptionPane.showMessageDialog(null, "Vetor em Ordem Decrescente: " + vetorDecrescente);
    }

    public static int lerInteiro(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }
}
//objetivo é criar um vetor, ordená-lo em ordem crescente e decrescente e exibir os resultados
// O código utiliza a classe JOptionPane para ler os dados do usuário e exibir os resultados
class Vetor {
    private int[] vetor;

    public Vetor(int[] vetor) {
        this.vetor = vetor;
    }

    // Cria um vetor com valores inseridos pelo usuário
    public static Vetor criaVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            int leitura = MainVetores.lerInteiro("Digite o elemento " + i + ":");
            vetor[i] = leitura;
        }
        return new Vetor(vetor);
    }

    // Ordena o vetor em ordem crescente
    public Vetor ordenarCrescente() {
        int[] vetorOrdenado = Arrays.copyOf(vetor, vetor.length);
        Arrays.sort(vetorOrdenado);
        return new Vetor(vetorOrdenado);
    }

    // Ordena o vetor em ordem decrescente
    // Inverte o vetor ordenado em ordem crescente
    // para obter a ordem decrescente
    public Vetor ordenarDecrescente() {
        int[] vetorOrdenado = Arrays.copyOf(vetor, vetor.length);
        Arrays.sort(vetorOrdenado);
        for (int i = 0; i < vetorOrdenado.length / 2; i++) {
            int temp = vetorOrdenado[i];
            vetorOrdenado[i] = vetorOrdenado[vetorOrdenado.length - 1 - i];
            vetorOrdenado[vetorOrdenado.length - 1 - i] = temp;
        }
        return new Vetor(vetorOrdenado);
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }
}
