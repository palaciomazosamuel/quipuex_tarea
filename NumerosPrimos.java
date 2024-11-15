import java.util.ArrayList;
import java.util.List;


public class NumerosPrimos {

        public static void main(String[] args) {
            int[] numeros = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            List<Integer> primos = encontrarPrimos(numeros);
            System.out.println("Números primos en la lista: " + primos);
        }

    public static List<Integer> encontrarPrimos(int[] numeros) {
        List<Integer> primos = new ArrayList<>();

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos.add(numero); 
            }
        }

        return primos;
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false; 
        for (int i = 2; i < numero; i++) { 
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}