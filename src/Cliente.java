public class Cliente {
    private String nome;
    private String documento; // CPF para pessoa física, CNPJ para pessoa jurídica

    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    // Getters e Setters omitidos para brevidade
}
