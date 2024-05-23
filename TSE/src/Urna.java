import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String option;
        int controle = 0;
        System.out.println("Escolha uma opção para voto:");
        option = scan.next();
        System.out.println("1- Zezinho \n 2- Lunguinho \n 3- Luizinho ");

       int voto =  Integer.parseInt(option);


    do {
        switch (option) {
            case 1:
                System.out.println("Zezinho");
                break;
            case 2:
                System.out.println("Zezinho");
                break;
            case 3:
                System.out.println("Zezinho");
                break;
            case "shut down":

            default:
                System.out.println("voto nulo");
                ;

        }
    }while(controle !=1);
    }
}
