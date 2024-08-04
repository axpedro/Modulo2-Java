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
    public Paciente(){}
    public Paciente(String nome, int idade, double peso, double altura, double pressaoArterial, double freqCardiaca, String dietaAlimentar, ArrayList<String> atividadesFisicas, double imc) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pressaoArterial = pressaoArterial;
        this.freqCardiaca = freqCardiaca;
        DietaAlimentar = dietaAlimentar;
        this.atividadesFisicas = atividadesFisicas;
        this.imc = imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getFreqCardiaca() {
        return freqCardiaca;
    }

    public void setFreqCardiaca(double freqCardiaca) {
        this.freqCardiaca = freqCardiaca;
    }

    public String getDietaAlimentar() {
        return DietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        DietaAlimentar = dietaAlimentar;
    }

    public ArrayList<String> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    public void setAtividadesFisicas(ArrayList<String> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}

