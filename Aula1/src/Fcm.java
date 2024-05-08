import java.util.Scanner;

public class Fcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, frequencia;



        System.out.println("Insira sua idade");
        idade = scan.nextInt();


        frequencia = 220-idade;

        System.out.println("Seu FCM: " + frequencia);

        scan.close();
    }
}
