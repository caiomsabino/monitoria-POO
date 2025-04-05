package JavaBasics;
public class Vetores {
    //exemplo de vetor, array, lista, etc.
    public static void main(String[] args) {
        int[] vetor = new int[] {9, 3, 6, 4, 5, 8, 0, 2, 7, 1};
        System.out.println(imprimirVetor(vetor));
        
        int[] resposta = foo(vetor, 3);
        System.out.println(imprimirVetor(resposta));
    }
    //descobrir comportamento dessa função, resposta lá em baixo
    
    static int[] foo(int[] vetor, int k) {
        int[] novo = new int[vetor.length];
        int j = k;
        for (int i=0; i<vetor.length; i++) {
            novo[j] = vetor[i];
            j++;
            if (j == vetor.length) {
                j = 0;
            }
        }
        return novo;
    }

    
    static String imprimirVetor(int[] vetor) {
        String resposta = "[ ";
        for (int i=0; i<vetor.length; i++) {
            resposta += vetor[i] + (i < vetor.length - 1 ? ", " : " ]"); 
        }
        return resposta;
    }
}



//basicamente joga para três posições à frente cada elemento do vetor


