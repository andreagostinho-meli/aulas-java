public class Empresa {
    private String nome;
    private double valorDeMercado;
    private double taxaDeCrescimento;

    public Empresa(String nome, double valorDeMercado, double taxaDeCrescimento) {
        this.nome = nome;
        this.valorDeMercado = valorDeMercado;
        this.taxaDeCrescimento = taxaDeCrescimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    public double getTaxaDeCrescimento() {
        return taxaDeCrescimento;
    }

    public void setTaxaDeCrescimento(double taxaDeCrescimento) {
        this.taxaDeCrescimento = taxaDeCrescimento;
    }
}
