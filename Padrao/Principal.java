package Padrao;

public class Principal {
    public static void main(String[] args) {
        Termo[] array = {
            new Termo(3),
            new Termo(6),
            new Termo(8),
            new Termo(10),
            new Termo(1),
            new Termo(2),
            new Termo(1)
        };
        Ordenacao ordenacao = new Ordenacao(array);
        ordenacao.ordenar(0, array.length- 1);

        System.out.println("Array ordenado: ");
        ordenacao.imprimirArray();
    }
}
class Termo {
    int valor;

    public Termo(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
}

class Ordenacao{
    private Termo[] array;

    public Ordenacao(Termo[] array){
        this.array = array;
    }
    public void ordenar(int inicio, int fim){
        if(inicio < fim){
            int pivoIndex = particionar(inicio, fim);
            ordenar(inicio, pivoIndex - 1);
            ordenar(pivoIndex + 1, fim);
        }
    }
    private int particionar(int inicio, int fim){
        Termo pivo = array[fim];
        int i = inicio -1;

        for(int j = inicio; j<fim; j++){
            if(array[j].getValor() <= pivo.getValor()){
                i++;
                trocar(i, j);
            }
        }

        trocar(i+1, fim);
        return i + 1;
        
    }

    private void trocar(int i, int j){
        Termo temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void imprimirArray(){
        for(Termo termo : array){
            System.out.println(termo.getValor() + " ");
        }
        System.out.println();
    }
}

