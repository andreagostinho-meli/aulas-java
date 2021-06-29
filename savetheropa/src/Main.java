import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vestuario> minhasRoupas = new ArrayList<Vestuario>();
        minhasRoupas.add(new Vestuario("Hering", "Camiseta básica"));
        minhasRoupas.add(new Vestuario("Hangar 33", "Calça jeans"));

        GuardaRoupa meuGuardaRoupa = new GuardaRoupa();

        System.out.println(
                "Código identificador: " +
                meuGuardaRoupa.guardarVestuarios(minhasRoupas));

        System.out.println("\nTodas as roupas que estão no guarda roupa:");
        meuGuardaRoupa.mostrarVestuarios();

        System.out.println("\nRetirando as roupas de um identificador específico:");
        System.out.println(meuGuardaRoupa.devolverVestuarios(0));
    }
}
