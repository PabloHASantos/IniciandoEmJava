package ExerciciosRepetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de testes: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println("Digite dois números: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            double divisao = num1 / num2;
            if(num2 == 0){
                System.out.println("Divisão impossível");
            }else{
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}
