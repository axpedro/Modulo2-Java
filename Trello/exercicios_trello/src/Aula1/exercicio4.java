package Aula1;

import java.util.ArrayList;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> caloriasTotais = new ArrayList<Integer>();
        //int[] a = new int[7];
        String[] dias = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira", "Sábado" , "Domingo"};
        int[] calDiaria = new int[7];

        int totalCal = 0;
        //int calDiaria = 0;
        System.out.println("#Contador de calorias#\n ");

        for(var i = 0;i < dias.length; i++){
            System.out.println("Insira a quantidade de calorias para " + dias[i] +": ");
            calDiaria[i] = scan.nextInt();

        }


        for(var i = 0;i < dias.length; i++ ){
            totalCal += calDiaria[i];

        };

        System.out.println("Total calorias da semana: " + totalCal);
        System.out.println("Media calorias da semana: " + totalCal/7);

        for(int i = 0; i < 7; i++ ){
            if(calDiaria[i] > 2000){
                System.out.println("Você excedeu o consumo de calorias acima de 2000: " +dias[i]);


            }
            else{
                System.out.println("Parabéns, " + dias[i] + " você ficou abaixo de 2000 calorias");
            }


        }



    }
}


