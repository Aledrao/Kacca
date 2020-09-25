/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.asas.kacca.dto;

import java.util.List;

/**
 *
 * @author Alex
 */
public class Venda {
    
    private Long venda;
    private List<ItemVenda> itens;
    private Integer quantidadeItens;
    private Float totalVenda;

    public Long getVenda() {
        return venda;
    }

    public void setVenda(Long venda) {
        this.venda = venda;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Float totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public String toString() {
        return "Venda{" + "venda=" + venda + ", itens=" + itens + ", quantidadeItens=" + quantidadeItens + ", totalVenda=" + totalVenda + '}';
    }    
}
