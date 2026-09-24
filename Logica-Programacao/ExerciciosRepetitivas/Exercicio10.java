package ExerciciosRepetitivas;
import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3)); // Utilizando funções dentro do JAVA
        }

        System.out.println();

        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }


        sc.close();
    }
}
