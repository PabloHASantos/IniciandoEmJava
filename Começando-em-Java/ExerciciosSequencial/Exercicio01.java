package ExerciciosSequencial;

import java.util.Scanner;

public class Exercicio01 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite dois números inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        soma = a + b;
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
