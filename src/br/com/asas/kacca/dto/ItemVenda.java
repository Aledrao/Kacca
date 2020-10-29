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
public class ItemVenda {
    
    private Integer codigo;
    private Produto produto;
    private float quantidadeVendaItem;
    private float precoUnitario;
    private float valorTotalVendaItem;

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

    public float getQuantidadeVendaItem() {
        return quantidadeVendaItem;
    }

    public void setQuantidadeVendaItem(float quantidadeVendaItem) {
        this.quantidadeVendaItem = quantidadeVendaItem;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
        this.valorTotalVendaItem = quantidadeVendaItem * precoUnitario;
    }

    public float getValorTotalVendaItem() {
        return valorTotalVendaItem;
    }    

    @Override
    public String toString() {
        return "ItemVenda{" + "codigo=" + codigo + ", produto=" + produto + ", quantidadeVendaItem=" + quantidadeVendaItem + ", precoUnitario=" + precoUnitario + ", valorTotalVendaItem=" + valorTotalVendaItem + '}';
    }
}
