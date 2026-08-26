package Materias;
import java.util.Scanner;

public class Condicional {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        if(numero1 > numero2){
            System.out.println("o número: " + numero1 + " é maior!");
        }else{
            System.out.println("o número: " + numero2 + " é maior!");
        }
    }
}
