package br.dell.modelos;

public class Produto {

    private String nome;
    private Float preco;
    private String path;

    public Produto() {
    }

    public Produto(String nome, Float preco, String path) {
        this.nome = nome;
        this.preco = preco;
        this.path = path;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
