package ExerciciosSequencial;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite quatro números inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diferenca = (a * b - c * d);
        System.out.println("A diferença é: "+ diferenca);

        sc.close();
    }
}
