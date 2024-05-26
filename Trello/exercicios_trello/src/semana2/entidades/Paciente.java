package semana2.entidades;

import java.util.ArrayList;

public class Paciente { //classe paciente
    //atributos da classe:
   public String nome;
    public int idade;
    public double peso;
    public  double altura;
    public   double pressaoArterial;
    public  double freqCardiaca;
    public   String DietaAlimentar;
    public  ArrayList<String> atividadesFisicas = new ArrayList<>();
    public  double imc;


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
    System.out.println("\nDieta alimentar:" + this.DietaAlimentar);
    System.out.println("\nLista de Atividades fisicas:" + this.atividadesFisicas);
    System.out.println("\nIMC:" + this.imc);


    }
    public void registroAtvFisica(String atividade){
        //atividadesFisicas = new ArrayList<>();
        atividadesFisicas.add(atividade);
    }

}

