import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }

    public void registrarCarro(Carro carro) throws Exception {
        verificarSeAtingiuLimiteVeiculos();
        listaVeiculos.add(carro);
    }

    public void registrarMoto(Moto moto) throws Exception {
        verificarSeAtingiuLimiteVeiculos();
        listaVeiculos.add(moto);
    }

    private void verificarSeAtingiuLimiteVeiculos() throws Exception {
        boolean limiteAtingido = listaVeiculos.size() == quantidadeVeiculosPermitidos;
        if(limiteAtingido)
            throw new Exception("O limite de veículos na corrida foi atingido!");
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        for(Veiculo veiculo : listaVeiculos) {
            if(veiculo.getPlaca().equals(placa)) {
                listaVeiculos.remove(veiculo);
                break;
            }
        }
    }

    public Veiculo verificarVencedor() {
        Collections.sort(listaVeiculos);
        return listaVeiculos.get(0);
    }
}
