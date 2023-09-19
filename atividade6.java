import java.util.Random;

public class atividade6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.println("O Array original é:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int[] numerosReversos = new int[10];
        for (int i = 0; i < 10; i++) {
            numerosReversos[i] = numeros[9 - i];
        }

        System.out.println("\n\nO Array na forma inversa é:");
        for (int numero : numerosReversos) {
            System.out.print(numero + " ");
        }
    }
}
