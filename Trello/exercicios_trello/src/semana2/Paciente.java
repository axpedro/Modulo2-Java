package semana2;

import java.util.ArrayList;

public class Paciente { //classe paciente
    //atributos da classe:
    String nome;
    int idade;
    double peso;
    double altura;
    double pressaoArterial;
    double freqCardiaca;
    String DietaAlimentar;
    ArrayList<String> atividadesFisicas;
    double imc;


public double calculoIMC(double peso, double altura){
    this.imc = peso/(altura*altura);

    return imc;
}


public void informacoes(){
    System.out.println("Nome:" + this.nome);
    System.out.println("\nIdade:" + this.idade);
    System.out.println("\nAltura:" + this.altura);
    System.out.println("\nPeso:" + this.peso);


    System.out.println("\nPA:" + this.pressaoArterial);
    System.out.println("\nFA:" + this.freqCardiaca);
    System.out.println("\nFA:" + this.DietaAlimentar);
    System.out.println("\nFA:" + this.atividadesFisicas);
    System.out.println("\nIMC:" + this.imc);


    }
    public void registroAtvFisica(String atividade){

        atividadesFisicas.add(atividade);
    }

}

