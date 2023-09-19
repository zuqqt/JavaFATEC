import java.util.Random;

public class SimulacaoJogoDados {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroDeLancamentos = 100;
        int contagemSoma7 = 0;

        for (int i = 0; i < numeroDeLancamentos; i++) {
            // Simula o lançamento de dois dados
            int dado1 = rand.nextInt(6) + 1; // Números de 1 a 6
            int dado2 = rand.nextInt(6) + 1;

            // Calcula a soma dos dois dados
            int soma = dado1 + dado2;

            // Verifica se a soma é igual a 7
            if (soma == 7) {
                contagemSoma7++;
            }
        }

        // Imprime o resultado
        System.out
                .println("Após " + numeroDeLancamentos + " lançamentos, a soma 7 ocorreu " + contagemSoma7 + " vezes.");
    }
}
