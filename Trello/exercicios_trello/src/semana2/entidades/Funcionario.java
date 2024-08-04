package semana2.entidades;

public class Funcionario {

    private String Nome;
    private int Idade;
    private Endereco Endereco;
    private double Salario;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, semana2.entidades.Endereco endereco, double salario) {
        Nome = nome;
        Idade = idade;
        Endereco = endereco;
        Salario = salario;
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

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
