package br.dell;

import br.dell.modelos.*;
import java.util.ArrayList;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Cliente fulano = new Cliente("Fulano da Silva");
        Cliente sicrano = new Cliente("Sicrano da Silva");

        Produto produto1 = new Produto("música", 1.99f, "/caminho/produto1");
        Produto produto2 = new Produto("vídeo", 2.99f, "/caminho/produto2");
        Produto produto3 = new Produto("imagem", 0.99f, "/caminho/produto3");
        Produto produto4 = new Produto("música", 1.99f, "/caminho/produto4");
        Produto produto5 = new Produto("vídeo", 2.99f, "/caminho/produto5");
        Produto produto6 = new Produto("imagem", 0.99f, "/caminho/produto6");

        ArrayList<Produto> lista1 = new ArrayList<>();
        lista1.add(produto1);
        lista1.add(produto2);
        lista1.add(produto3);

        ArrayList<Produto> lista2 = new ArrayList<>();
        lista2.add(produto3);
        lista2.add(produto4);
        lista2.add(produto5);

        RegistroDePagamento registroFulano = new RegistroDePagamento(lista1, new Date(), fulano);
        RegistroDePagamento registroSicrano = new RegistroDePagamento(lista2, new Date(), sicrano);

        System.out.println(registroFulano);
        System.out.println();
        System.out.println(registroSicrano);

    }
}
