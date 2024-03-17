public class Aluguel<T extends Veiculo, U extends Cliente> {
    private T veiculo;
    private U cliente;
    private String dataInicio;
    private String dataFim;

    public Aluguel(T veiculo, U cliente, String dataInicio, String dataFim) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters e Setters omitidos para brevidade
}
