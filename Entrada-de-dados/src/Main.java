import java.util.Scanner;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;

    x = sc.nextInt();
    sc.nextLine();
    s1 =  sc.nextLine();
    s2 =  sc.nextLine();
    s3 =  sc.nextLine();

    IO.println("Dados digitados: ");
    IO.println(x);
    IO.println(s1);
    IO.println(s2);
    IO.println(s3);
    sc.close();
}

