package Aula1;

import java.util.Scanner;

public class backup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = -2;
        int origem;
        int destino;
        int medida;

        System.out.println("Conversor de medidas");
        System.out.println("Escolha a categoria: \n 1 - Comprimento: \n 2 - Peso:");
        option = scan.nextInt();

        switch (option) {

            case 1:
                System.out.println("Escolhido comprimento...");
                System.out.println("Escolha unidade de origem:");
                System.out.println(" 1 - Metros");
                System.out.println(" 2 - Centimetros");
                System.out.println(" 3 - Polegadas");
                option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Escolhido metro");
                        System.out.println("Escolha unidade de destino:");
                        System.out.println(" 1 - Metros");
                        System.out.println(" 2 - Centimetros");
                        System.out.println(" 3 - Polegadas");
                        option = scan.nextInt();
                        System.out.println("Insira o valor a ser convertido:");
                        medida = scan.nextInt();
                        switch (option){
                            case 1:
                                System.out.println("Medida de " +medida +" metros = " + medida + " metros");
                                break;
                            case 2:
                                System.out.println("Medida de " +medida +" metros = " + medida/100 + " centimetros");
                                break;
                            case 3:
                                System.out.println("Medida de " +medida +" metros = " + medida*39.37 + " polegadas");
                                break;


                        }

                        break;


                    case 2:
                        System.out.println("Escolhido centimetros");
                        System.out.println("Escolha unidade de destino:");
                        System.out.println(" 1 - Metros");
                        System.out.println(" 2 - Centimetros");
                        System.out.println(" 3 - Polegadas");
                        option = scan.nextInt();
                        System.out.println("Insira o valor a ser convertido:");
                        medida = scan.nextInt();
                        switch (option){
                            case 1:
                                System.out.println("Medida de " +medida +" centimetros = " + medida/100 + " metros");
                                break;
                            case 2:
                                System.out.println("Medida de " +medida +" centimetros = " + medida + " centimetros");
                                break;
                            case 3:
                                System.out.println("Medida de " +medida +" centimetros = " + medida/2.54 + " polegadas");
                                break;


                        }
                        break;
                    case 3:
                        System.out.println("Polegadas");
                        break;
                }






                break;
            case 2:
                System.out.println("Escolha unidade de origem:");
                switch (option) {
                    case 1:
                        System.out.println("Quilogramas (kg)");
                        break;
                    case 2:
                        System.out.println("Gramas (g)");
                        break;
                    case 3:
                        System.out.println("Libras (lb)");
                        break;


                }


        }


    }
}


//Escolha a categoria:
//
//        1. Comprimento
//2. Peso
//
//Opção: 1
//
//Escolha a unidade de origem:
//
//        1. Metros
//2. Centímetros
//3. Polegadas
//
//Opção: 2
//
//Escolha a unidade de destino:
//
//        1. Metros
//2. Centímetros
//3. Polegadas
//
//Opção: 1
//
//Digite o valor: 100
//Resultado da conversão: 1 metro = 100 centímetros