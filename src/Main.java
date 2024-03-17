public class Main {
    public static void main(String[] args) {
        Locadora<Veiculo, Cliente> locadora = new Locadora<>();

        Veiculo veiculo1 = new Veiculo("ABC1234", TipoVeiculo.PEQUENO);
        Veiculo veiculo2 = new Veiculo("DEF5678", TipoVeiculo.MEDIO);

        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Empresa XYZ", "00.000.000/0001-00");

        locadora.cadastrarVeiculo(veiculo1);
        locadora.cadastrarVeiculo(veiculo2);
        locadora.cadastrarCliente(cliente1);
        locadora.cadastrarCliente(cliente2);

        // Aqui você pode chamar outros métodos da locadora conforme necessário
    }
}
