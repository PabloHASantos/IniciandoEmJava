package ExerciciosSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca1, peca2, qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2, valorPagar;

        System.out.println("Peça 1 - Digite o código da peça, quantidade de peças e o valor da peça: ");
        peca1 = sc.nextInt();
        qtdPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        System.out.println("Peça 2 - Digite o código da peça, quantidade de peças e o valor da peça: ");
        peca2 = sc.nextInt();
        qtdPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorPagar = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("Valor a pagar %.2f", valorPagar);


        sc.close();
    }
}
