package Modelo;

public class Produto implements Movimentavel {
    private String nome;
    private int quantidade;

    public Produto(String nome) {
        this.nome = nome;
        this.quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void entradaEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void saidaEstoque(int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > this.quantidade) {
            throw new EstoqueInsuficienteException("Estoque insuficiente para a saída solicitada.");
        }
        this.quantidade -= quantidade;
    }

    public String getNome() {
        return nome;
    }
}
