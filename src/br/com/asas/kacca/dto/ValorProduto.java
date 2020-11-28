/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.asas.kacca.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "VALOR_PRODUTO")
public class ValorProduto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VALOR_PRODUTO")
    private Integer codigo;
    
    private Produto produto;
    
    @Column(name = "VALOR_VENDA", nullable = false)
    private Float valorVenda;
    
    @Column(name = "VALOR_COMPRA", nullable = false)
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
