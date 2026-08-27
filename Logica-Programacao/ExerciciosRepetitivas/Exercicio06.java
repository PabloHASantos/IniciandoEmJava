package ExerciciosRepetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de testes: ");
        int qtd = sc.nextInt();

        for(int i=0; i< qtd; i++ ){
            System.out.println("Digite os 3 valores: ");
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();
            double mediaPond = (valor1 * 2 + valor2 * 3 + valor3 * 5)/ (2 + 3 + 5);
            System.out.printf("%.1f\n", mediaPond);
        }

        sc.close();
    }
}
