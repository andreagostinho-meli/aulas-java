public class Vestuario {
    private String marca;
    private String modelo;

    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{ " +
                marca +
                ", " + modelo +
                " }";
    }
}
