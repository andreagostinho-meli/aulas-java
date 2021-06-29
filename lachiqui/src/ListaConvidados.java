import java.util.ArrayList;
import java.util.List;

public class ListaConvidados {
    private List<Convidado> listaDeConvidados;

    public ListaConvidados() {
        listaDeConvidados = new ArrayList<Convidado>();
    }

    public void adicionar(Convidado convidado) {
        listaDeConvidados.add(convidado);
    }

    public void servirComida() {
        for(Convidado convidado : listaDeConvidados) {
            convidado.comerBolo();
        }
    }
}
