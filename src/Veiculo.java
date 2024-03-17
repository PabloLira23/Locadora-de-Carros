public enum TipoVeiculo {
    PEQUENO,
    MEDIO,
    SUV
}

public class Veiculo implements Comparable<Veiculo> {
    private String placa;
    private TipoVeiculo tipo;
    private boolean disponivel;

    public Veiculo(String placa, TipoVeiculo tipo) {
        this.placa = placa;
        this.tipo = tipo;
        this.disponivel = true;
    }

    // Getters e Setters omitidos para brevidade

    @Override
    public int compareTo(Veiculo outroVeiculo) {
        return this.placa.compareTo(outroVeiculo.placa);
    }
}
