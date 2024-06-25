package semana2.entidades;

import java.util.ArrayList;
import java.util.Optional;

public class Nutricionista  extends Funcionario{
  private  ArrayList<String> listaCertificados =  new ArrayList<>();;
    private  int numeroConsultas;
    private int tempoXp;

    public Optional isnull;

public Nutricionista(){}
  public Nutricionista(String nome, int idade, semana2.entidades.Endereco endereco, double salario, ArrayList<String> listaCertificados, int numeroConsultas, int tempoXp) {
    super(nome, idade, endereco, salario);
    this.listaCertificados = listaCertificados ;
    this.numeroConsultas = numeroConsultas;
    this.tempoXp = tempoXp;
  }

  public void adicionarTempoDeXp (){
    this.tempoXp += 1;
  }

  public void adicionaCertificacao(String certificado){


  listaCertificados.add(certificado);
  }

  public int getTempoXp() {
    return tempoXp;
  }

  public void setTempoXp(int tempoXp) {
    this.tempoXp = tempoXp;
  }

  public ArrayList<String> getListaCertificados() {
    return listaCertificados;
  }

  public void setListaCertificados(ArrayList<String> listaCertificados) {
    this.listaCertificados = listaCertificados;
  }

  public int getNumeroConsultas() {
    return numeroConsultas;
  }

  public void setNumeroConsultas(int numeroConsultas) {
    this.numeroConsultas = numeroConsultas;
  }


  public static Optional<Nutricionista> buscarNutricionistaPorNome(ArrayList<Nutricionista> nutricionistas, String nome) {
    return nutricionistas.stream()
            .filter(nutricionista -> nutricionista.getNome().equalsIgnoreCase(nome))
            .findFirst();
  }

  public static boolean VerificaAntesDoCadastro (ArrayList<Nutricionista> nutricionistas, String nome){
    Optional<Nutricionista> encontrado = buscarNutricionistaPorNome(nutricionistas, nome);
    if(encontrado.isPresent()){
      System.out.println("Insira outro nome, pois já existe um nutricionista com esete nome!");
      return true;
    }
    else {
      return false;}

  }



}
