package ExerciciosRepetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Digite a primeira e a segunda coordenada: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            }else if(x < 0  && y > 0 ){
                System.out.println("Segundo");
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }else {
                System.out.println("Quarto");
            }
            System.out.println("Digite a primeira e a segunda coordenada: ");
            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();
    }
}
