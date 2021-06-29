import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> guardaRoupa;
    private int identificador;

    public GuardaRoupa() {
        guardaRoupa = new HashMap<Integer, List<Vestuario>>();
        identificador = 0;
    }

    public int guardarVestuarios(List<Vestuario> listaDeVestuario) {
        guardaRoupa.put(identificador, listaDeVestuario);
        identificador++;
        return identificador - 1;
    }

    public void mostrarVestuarios() {
        for (int key : guardaRoupa.keySet()) {
            List value = guardaRoupa.get(key);
            System.out.println(key + " = " + value);
        }
    }

    public List<Vestuario> devolverVestuarios(int id) {
        if (!guardaRoupa.containsKey(id))
            System.out.println("Chave não existe");

        return guardaRoupa.get(id);
    }
}
