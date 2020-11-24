/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.asas.kacca.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alex
 */   
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    private static final long serialVersionUID = -8998560379753525271L;
    
    @EmbeddedId
    private ClienteId id;
    
    @Column(name = "NOME", nullable = false)
    private String nome;
    
    @Column(name = "RG", length = 9)
    private String rg;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "TELEFONE_FIXO", length = 10)
    private String telefoneFixo;
    
    @Column(name = "CELULAR", length = 11)
    private String celular;
    
    @Column(name = "TIPO_LOGRADOURO")
    private String tipoLogradouro;
    
    @Column(name = "LOGRADOURO")
    private String logradouro;
    
    @Column(name = "NUMERO_LOGRADOURO")
    private String numeroLogradouro;
    
    @Column(name = "COMPLEMENTO_LOGRADOURO")
    private String complementoLogradouro;
    
    @Column(name = "BAIRRO")
    private String bairro;
    
    @Column(name = "CIDADE")
    private String cidade;
    
    @Column(name = "ESTADO")
    private String estado;
    
    @Column(name = "CEP")
    private String cep;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;    

    public ClienteId getId() {
        return id;
    }

    public void setId(ClienteId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(String numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getComplementoLogradouro() {
        return complementoLogradouro;
    }

    public void setComplementoLogradouro(String complementoLogradouro) {
        this.complementoLogradouro = complementoLogradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", email=" + email + ", telefoneFixo=" + telefoneFixo + ", celular=" + celular + ", tipoLogradouro=" + tipoLogradouro + ", logradouro=" + logradouro + ", numeroLogradouro=" + numeroLogradouro + ", complementoLogradouro=" + complementoLogradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", dataCadastro=" + dataCadastro + '}';
    }
}
