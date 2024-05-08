import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura , peso;



        System.out.println("Insira sua altura");
        altura = scan.nextDouble();

        System.out.println("Insira seu peso:");
        peso = scan.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println("Seu imc será: " + imc);
        System.out.printf("Seu peso será: %.2f", imc);
        scan.close();
    }
}
