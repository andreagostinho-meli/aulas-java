import java.util.ArrayList;
import java.util.List;

public class ListaFogosArtificio {
    private List<FogoArtificio> listaDeFogos;

    public ListaFogosArtificio() {
        listaDeFogos = new ArrayList<FogoArtificio>();
    }

    public void adicionar(FogoArtificio fogoArtificio) {
        listaDeFogos.add(fogoArtificio);
    }

    public void explodirTodos() {
        for(FogoArtificio fogoArtificio : listaDeFogos) {
            fogoArtificio.explodir();
        }
    }
}
