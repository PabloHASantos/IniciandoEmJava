//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    double x = 9.0;
    double y = 3.0;
    double z = -5.0;
    double a, b, c;

    a = Math.sqrt(x); // função para realizar o cálculo de raiz quadrada
    b = Math.pow(x, y); // função para realizar o cálculo de potenciação
    c = Math.abs(z); // função para descobrir número absoluto

    IO.println("A raiz quadrada de " + x + " é: " + a );
    IO.println(x + " elevado a " + y + " é igual a: " + b);
    IO.println("O número absoluto de "+ z + " é: " + c);



}

