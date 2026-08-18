package ExerciciosCondicionais;
import java.util.Scanner;

public class Exercicio02 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;


        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("O numero "+a+" é PAR!");
        }else{
            System.out.println("O número "+a+" é IMPAR!");
        }

        sc.close();
    }
}
