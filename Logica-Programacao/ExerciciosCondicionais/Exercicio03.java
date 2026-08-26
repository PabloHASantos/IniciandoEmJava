package ExerciciosCondicionais;
import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Os números são multiplos");
        }else{
            System.out.println("Os números não são multiplos");
        }

        sc.close();
    }
}
