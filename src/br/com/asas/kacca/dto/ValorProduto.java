/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.asas.kacca.dto;

/**
 *
 * @author Alex
 */
public class ValorProduto {
    
    private Integer codigo;
    private Produto produto;
    private Float valorVenda;
    private Float valorCompra;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Float valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "ValorProduto{" + "codigo=" + codigo + ", produto=" + produto + ", valorVenda=" + valorVenda + ", valorCompra=" + valorCompra + '}';
    }
}
