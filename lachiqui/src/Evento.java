import java.util.ArrayList;
import java.util.List;

public class Evento {
    public static void main(String[] args) {
        // Preparando fogos de artifício
        ListaFogosArtificio listaDeFogos = new ListaFogosArtificio();

        listaDeFogos.adicionar(new FogoArtificioIndividual("Barulho baixo"));
        listaDeFogos.adicionar(new FogoArtificioIndividual("Barulho mediano"));
        listaDeFogos.adicionar(new FogoArtificioIndividual("Barulho alto"));

        FogoArtificio pacoteDeFogos = new PacoteFogosArtificio();
        pacoteDeFogos.adicionar(new FogoArtificioIndividual("Barulho baixo"));
        pacoteDeFogos.adicionar(new FogoArtificioIndividual("Barulho mediano"));
        pacoteDeFogos.adicionar(new FogoArtificioIndividual("Barulho alto"));

        listaDeFogos.adicionar(pacoteDeFogos);

        // Anotando os convidados
        ListaConvidados listaDeConvidados = new ListaConvidados();

        listaDeConvidados.adicionar(new ConvidadoMeli());
        listaDeConvidados.adicionar(new ConvidadoMeli());
        listaDeConvidados.adicionar(new ConvidadoMeli());
        listaDeConvidados.adicionar(new ConvidadoStandard());
        listaDeConvidados.adicionar(new ConvidadoStandard());

        // Estourando todos os fogos
        listaDeFogos.explodirTodos();

        // Servindo comida aos convidados
        listaDeConvidados.servirComida();
    }
}
