import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends Veiculo, U extends Cliente> {
    private List<T> veiculos;
    private List<U> clientes;
    private List<Aluguel<T, U>> alugueis;

    public Locadora() {
        veiculos = new ArrayList<>();
        clientes = new ArrayList<>();
        alugueis = new ArrayList<>();
    }

    public void cadastrarVeiculo(T veiculo) {
        if (!veiculos.contains(veiculo)) {
            veiculos.add(veiculo);
        } else {
            System.out.println("Veículo já cadastrado.");
        }
    }

    public void cadastrarCliente(U cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente já cadastrado.");
        }
    }

    // Métodos para buscar, alugar e devolver veículos ficariam aqui
}
