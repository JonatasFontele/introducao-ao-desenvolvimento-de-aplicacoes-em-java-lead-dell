package br.dell.modelos;

import java.util.Date;
import java.util.List;

public class RegistroDePagamento {

    private List<Produto> produtos;
    private Date dataCompra;
    private Cliente cliente;

    public RegistroDePagamento() {
    }

    public RegistroDePagamento(List<Produto> produtos, Date dataCompra, Cliente cliente) {
        this.produtos = produtos;
        this.dataCompra = dataCompra;
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "RegistroDePagamento{" +
                "produtos=" + produtos +
                ", dataCompra=" + dataCompra +
                ", cliente=" + cliente +
                '}';
    }
}
