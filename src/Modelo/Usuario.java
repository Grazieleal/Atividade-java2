package Modelo;

public abstract class Usuario {
    protected String nome;
    protected String id;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract void mostrarTipoUsuario();
}
