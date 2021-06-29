public class FogoArtificioIndividual implements FogoArtificio {
    private String barulho;

    public FogoArtificioIndividual(String barulho) {
        this.barulho = barulho;
    }

    public void explodir() {
        System.out.println(barulho);
    }

    @Override
    public void adicionar(FogoArtificioIndividual fogoArtificio) {

    }
}
