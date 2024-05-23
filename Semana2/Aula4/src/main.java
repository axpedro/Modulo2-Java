import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PressaoArterial pa = new PressaoArterial();
        Paciente pessoa1 = new Paciente();

        Scanner scan = new Scanner(System.in);
        //pessoa1.historico.addAll(List.of("Vacinado" , "dor de cabheça"));

//        System.out.println("Insira sua pressao sistolica:");
//        int sis = scan.nextInt();
//        System.out.println("Insira sua pressao distolica:");
//        int dis = scan.nextInt();
//        pa.medicaoPA(sis,dis);


//        System.out.println("Insira seu peso:");
//        double peso = scan.nextDouble();
//        System.out.println("Insira sua altura:");
//        double altura = scan.nextDouble();
//        System.out.printf("Seu IMC: %2f" , pessoa1.IMC(altura, peso) );

        System.out.println("Insira as informações sobre o paciente:");
        pessoa1.historicoDoPaciente(scan.next());





    }
}
