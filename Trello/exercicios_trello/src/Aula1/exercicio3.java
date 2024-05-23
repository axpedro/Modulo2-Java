package Aula1;

import java.util.Scanner;
public class exercicio3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double distanciaPlaca =  1;
        double tempo;

        System.out.println("Insira o tempo que o veiculo levou para passar:");
        tempo = scan.nextDouble();


        double z = (distanciaPlaca/tempo);


        System.out.println("A VM foi : " + z*3.6 +" km/h");


    }

}
