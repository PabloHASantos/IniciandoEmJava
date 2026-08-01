package ExerciciosSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero, horas;
        double valorHoras, salario;

        System.out.println("Digite o número do funcionário, às horas trabalhadas e o valor da hora: ");
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHoras = sc.nextDouble();

        salario = horas * valorHoras;

        System.out.printf("Numero: %d%nSalário: %.2f", numero, salario);

        sc.close();
    }
}
