public class Veiculo implements Comparable<Veiculo> {
    private double velocidade;
    private double aceleracao;
    private double anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;
    private double pontuacao;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
        this.pontuacao = velocidade * aceleracao / ( anguloDeGiro * (peso - rodas * 100));
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public int compareTo(Veiculo veiculo) {
        return Double.compare(veiculo.pontuacao, pontuacao);
    }

    @Override
    public String toString() {
        return "{ " +
                placa +
                " " + pontuacao +
                " }";
    }
}
