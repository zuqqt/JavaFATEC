import java.util.Scanner;
import java.util.Random;

public class atividade5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt();
        }
        int contadorImpares = 0;
        for (int i = 0; i < 30; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("A quantidade de numeros impares é " + contadorImpares);
    }

}
