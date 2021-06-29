import java.util.ArrayList;
import java.util.List;

public class PacoteFogosArtificio implements FogoArtificio {
    private List<FogoArtificioIndividual> pacoteDeFogos;

    public PacoteFogosArtificio() {
        this.pacoteDeFogos = new ArrayList<FogoArtificioIndividual>();
    }

    public void adicionar(FogoArtificioIndividual fogoArtificio) {
        pacoteDeFogos.add(fogoArtificio);
    }

    public void explodir() {
        for(FogoArtificioIndividual fogoArtificio : pacoteDeFogos) {
            fogoArtificio.explodir();
        }
    }
}
