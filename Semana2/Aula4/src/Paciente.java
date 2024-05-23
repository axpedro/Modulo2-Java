import java.util.ArrayList;
import java.util.List;

public class Paciente {
    public  String nome;
    public int idade;
    public double peso;
    public double altura;
   public List<String> historico = new ArrayList<>();




    public  double IMC(double altura , double peso){


        return peso/(altura*altura);
    }

    public List<String>  historicoDoPaciente(String informacoes){
        this.historico.add(informacoes);
        System.out.println(historico);
    return historico;
    }
    public void preencherDados(){
        


    }


}
