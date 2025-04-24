package Modelo;

public interface Movimentavel {
    void entradaEstoque(int quantidade);
    void saidaEstoque(int quantidade) throws EstoqueInsuficienteException;
}

