package Aula1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Insira a largura do terreno: ");
        x = scan.nextInt();
        System.out.println("Insira o comprimento do terreno: ");
        y = scan.nextInt();
        int z = x * y;
        System.out.println("O terreno possui: " + z +"m2 de area.");


    }
}
