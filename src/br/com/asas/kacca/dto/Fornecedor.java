/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.asas.kacca.dto;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "FORNECEDOR")
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 3686580920078631635L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Integer codigo;
    
    @Column(name = "NOME_FORNECEDOR", nullable = false)
    private String nome;
    
    @Column(name = "TELEFONE_FIXO")
    private String telefone;
    
    @Column(name = "CELULAR")
    private String celular;
    
    private List<Produto> produtos;   

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", celular=" + celular + ", produtos=" + produtos + '}';
    }
}
