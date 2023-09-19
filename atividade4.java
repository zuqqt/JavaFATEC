import java.util.Random;

public class atividade4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 15; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Array de números aleatórios:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Pula uma linha para separar a saída

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
