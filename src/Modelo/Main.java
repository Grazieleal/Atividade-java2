package Modelo;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Vestidos");
        Funcionario funcionario = new Funcionario("Fernando", "F52");

        produto.entradaEstoque(50);

        try {
            produto.saidaEstoque(20);
            System.out.println("Saída realizada com sucesso!");
            System.out.println("Estoque atual de " + produto.getNome() + ": " + produto.getQuantidade());
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
