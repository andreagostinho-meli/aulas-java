public class Main {
    public static void main(String[] args) {
        try {
            Carro carro1 = new Carro(200, 15, 45, "ABC-1234");
            Moto moto1 = new Moto(200, 10, 30, "DEF-5678");

            Corrida corrida = new Corrida(10, 300000, "A corrida do século", 5);

            corrida.registrarCarro(carro1);
            corrida.registrarMoto(moto1);

            System.out.println("O vencedor da corrida é: " + corrida.verificarVencedor());

            new SocorristaCarro().socorrer(carro1);
            new SocorristaMoto().socorrer(moto1);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
