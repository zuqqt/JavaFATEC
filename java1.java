import java.util.Scanner;

class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();

        if (idade < 18) {
            System.out.println(("Você é menor de idade e tem: ") + idade);
        } else if (idade < 63) {
            System.out.println("Você é adulto e tem: " + idade);
        } else {
            System.out.println("Você é idoso e tem: " + idade);
        }

    }
}