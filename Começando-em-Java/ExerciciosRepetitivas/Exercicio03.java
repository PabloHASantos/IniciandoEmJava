package ExerciciosRepetitivas;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;
        System.out.println("Digite o código do combustível: ");
        int codigo = sc.nextInt();

        while(codigo != 4){
            switch (codigo){
                case 1:
                    alcool += 1;
                    System.out.println("Digite o código do combustível: ");
                    codigo = sc.nextInt();
                    break;
                case 2:
                    gasolina += 1;
                    System.out.println("Digite o código do combustível: ");
                    codigo = sc.nextInt();
                    break;
                case 3:
                    diesel += 1;
                    System.out.println("Digite o código do combustível: ");
                    codigo = sc.nextInt();
                    break;
                default:
                    System.out.println("Digite o código do combustível: ");
                    codigo = sc.nextInt();
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO!!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
