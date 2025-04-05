package JavaBasics;

public class Primos {
    public static void main(String[] args) {
        //saber se um número é primo ou não
        int limite = 20; 
        boolean[] primos = new boolean[limite + 1];
        
        for (int i = 0; i < primos.length; i++) {
            primos[i] = true;
        }
        primos[0] = false; 
        primos[1] = false; 
        
        /**
         * Crivo de Erastótenes
         */
        for (int i=2; i*i < limite; i++) {
            if (primos[i]) {
                for (int j = i * i; j<=limite; j+=i) {
                    primos[j] = false;
                }
            }
        }
        
        for (int i = 0; i < primos.length; i++) {
        	//operadores ternários (if or else)
            System.out.println(i + ": " + (primos[i] ? "primo" : "ñ-primo"));
        }
    }
}
