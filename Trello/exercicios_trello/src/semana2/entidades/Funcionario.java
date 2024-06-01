package semana2.entidades;

public class Funcionario {

    private String Nome;
    private int Idade;
    private Endereco Endereco;
    private double Salário;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, semana2.entidades.Endereco endereco, double salário) {
        Nome = nome;
        Idade = idade;
        Endereco = endereco;
        Salário = salário;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public semana2.entidades.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(semana2.entidades.Endereco endereco) {
        Endereco = endereco;
    }

    public double getSalário() {
        return Salário;
    }

    public void setSalário(double salário) {
        Salário = salário;
    }
}
