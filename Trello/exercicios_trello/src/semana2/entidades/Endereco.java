package semana2.entidades;

public class Endereco {

    private String Logradouro;
    private String Estado;
    private String Cidade;
    private int Número;
    private String CEP;

    public Endereco(String logradouro, String estado, String cidade, int número, String CEP) {
        Logradouro = logradouro;
        Estado = estado;
        Cidade = cidade;
        Número = número;
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public int getNúmero() {
        return Número;
    }

    public void setNúmero(int número) {
        Número = número;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
