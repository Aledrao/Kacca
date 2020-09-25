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
public class EstoqueProduto {
    private Integer codigo;
    private Produto produto;
    private Float quantidadeEstoque;
    private Float quantidadeMinima;

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

    public Float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Float getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Float quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    @Override
    public String toString() {
        return "EstoqueProduto{" + "codigo=" + codigo + ", produto=" + produto + ", quantidadeEstoque=" + quantidadeEstoque + ", quantidadeMinima=" + quantidadeMinima + '}';
    }    
}
