import java.util.Scanner;

public class Temps {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double temperatura ;



        System.out.println("Insira a temperatura em Celsius");
        temperatura = scan.nextDouble();



        double faren = temperatura*1.8 + 32;

        System.out.println("Farenheit: " + faren);

        scan.close();



    }
}
