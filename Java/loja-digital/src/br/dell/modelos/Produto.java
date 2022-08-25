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
}
