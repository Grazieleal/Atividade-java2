package Modelo;

public class Funcionario extends Usuario {
    public Funcionario(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void mostrarTipoUsuario() {
        System.out.println("Funcionário de Estoque");
    }
}
