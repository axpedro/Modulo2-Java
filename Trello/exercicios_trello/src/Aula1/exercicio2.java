package Aula1;

import java.util.Scanner;
public class exercicio2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = 1412;
        int y;
        System.out.println("#Quantos salários mínimos você recebe? Descubra: #");
        System.out.println("Insira o valor do seu salário:");
        y = scan.nextInt();


        int z = y/x;

        if(z > 1){
            System.out.println("Voce recebe : " + z +" salários mínimos");}
        else if(z<1){
            System.out.println("Voce recebe menos que o salário mínimo");
        }
        else{
            System.out.println("Voce recebe : " + z +" minimo");}


    }
}
