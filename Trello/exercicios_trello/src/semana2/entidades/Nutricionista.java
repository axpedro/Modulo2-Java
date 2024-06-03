package semana2.entidades;

import java.util.ArrayList;

public class Nutricionista  extends Funcionario{
  private  ArrayList<String> listaCertificados;
    private  int numeroConsultas;
    private int tempoXp;


  public Nutricionista(String nome, int idade, semana2.entidades.Endereco endereco, double salário, ArrayList<String> listaCertificados, int numeroConsultas, int tempoXp) {
    super(nome, idade, endereco, salário);
    listaCertificados = new ArrayList<>();
    this.listaCertificados = listaCertificados;
    this.numeroConsultas = numeroConsultas;
    this.tempoXp = tempoXp;
  }

  public void adicionarTempoDeXp (){
    this.tempoXp += 1;
  }

  public void adicionaCertificacao(String certificado){
    listaCertificados.add(certificado);
  }


}
