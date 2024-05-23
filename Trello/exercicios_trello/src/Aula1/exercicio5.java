package Aula1;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int categoria;
        int origem;
        int destino;
        double media;

        System.out.println("Conversor de medidas");
        System.out.println("Escolha a categoria: \n 1 - Comprimento: \n 2 - Peso:");
        categoria = scan.nextInt();

        switch (categoria) {
            case 1://categoria pro comprimento
                System.out.println("Escolhido comprimento...");
                System.out.println("Escolha unidade de origem:");
                System.out.println(" 1 - Metros");
                System.out.println(" 2 - Centímetros");
                System.out.println(" 3 - Polegadas");
                origem = scan.nextInt();

                System.out.println("Escolha unidade de destino:");
                System.out.println(" 1 - Metros");
                System.out.println(" 2 - Centímetros");
                System.out.println(" 3 - Polegadas");
                destino = scan.nextInt();

                System.out.println("Insira o valor a ser convertido:");
                media = scan.nextDouble();

                switch (origem) {
                    case 1: // Metros
                        switch (destino) {
                            case 1:
                                System.out.println("Medida de " + media + " metros = " + media + " metros");
                                break;
                            case 2:
                                System.out.println("Medida de " + media + " metros = " + media * 100 + " centímetros");
                                break;
                            case 3:
                                System.out.println("Medida de " + media + " metros = " + media * 39.37 + " polegadas");
                                break;
                        }
                        break;
                    case 2: // Centímetros
                        switch (destino) {
                            case 1:
                                System.out.println("Medida de " + media + " centímetros = " + media / 100 + " metros");
                                break;
                            case 2:
                                System.out.println("Medida de " + media + " centímetros = " + media + " centímetros");
                                break;
                            case 3:
                                System.out.println("Medida de " + media + " centímetros = " + media / 2.54 + " polegadas");
                                break;
                        }
                        break;
                    case 3: // Polegadas
                        switch (destino) {
                            case 1:
                                System.out.println("Medida de " + media + " polegadas = " + media / 39.37 + " metros");
                                break;
                            case 2:
                                System.out.println("Medida de " + media + " polegadas = " + media * 2.54 + " centímetros");
                                break;
                            case 3:
                                System.out.println("Medida de " + media + " polegadas = " + media + " polegadas");
                                break;
                        }
                        break;
                }
                break;

            case 2:  //categoria pro peso
                System.out.println("Escolhido peso...");
                System.out.println("Escolha unidade de origem:");
                System.out.println(" 1 - Quilogramas (kg)");
                System.out.println(" 2 - Gramas (g)");
                System.out.println(" 3 - Libras (lb)");
                origem = scan.nextInt();

                System.out.println("Escolha unidade de destino:");
                System.out.println(" 1 - Quilogramas (kg)");
                System.out.println(" 2 - Gramas (g)");
                System.out.println(" 3 - Libras (lb)");
                destino = scan.nextInt();

                System.out.println("Insira o valor a ser convertido:");
                media = scan.nextDouble();

                switch (origem) {
                    case 1: // Quilogramas
                        switch (destino) {
                            case 1:
                                System.out.println("Peso de " + media + " kg = " + media + " kg");
                                break;
                            case 2:
                                System.out.println("Peso de " + media + " kg = " + media * 1000 + " g");
                                break;
                            case 3:
                                System.out.println("Peso de " + media + " kg = " + media * 2.205 + " lb");
                                break;
                        }
                        break;
                    case 2: // Gramas
                        switch (destino) {
                            case 1:
                                System.out.println("Peso de " + media + " g = " + media / 1000 + " kg");
                                break;
                            case 2:
                                System.out.println("Peso de " + media + " g = " + media + " g");
                                break;
                            case 3:
                                System.out.println("Peso de " + media + " g = " + media / 453.592 + " lb");
                                break;
                        }
                        break;
                    case 3: // Libras
                        switch (destino) {
                            case 1:
                                System.out.println("Peso de " + media + " lb = " + media / 2.205 + " kg");
                                break;
                            case 2:
                                System.out.println("Peso de " + media + " lb = " + media * 453.592 + " g");
                                break;
                            case 3:
                                System.out.println("Peso de " + media + " lb = " + media + " lb");
                                break;
                        }
                        break;
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scan.close();
    }
}
