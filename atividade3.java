import java.util.Scanner;
import java.util.Random;

public class atividade3 {
    public static void main(String[] args) {
        // Declaração das variáveis:
        int a, b, c;
        // Declaração do vetor:
        int[] numeros = new int[20];
        // Chamada das bibliotecas java:
        Scanner ler = new Scanner(System.in);
        Random r = new Random();

        // Laço de repetição para preecnher os 100 arrays.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        // Calcula a soma
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Algoritmo
        double media = (double) soma / 20;

        // Saída final:
        System.out.println("Media dos numeros é " + media);
    }
}
