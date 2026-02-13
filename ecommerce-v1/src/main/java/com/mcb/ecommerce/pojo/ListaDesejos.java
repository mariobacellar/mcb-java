package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListaDesejos {
    @JsonProperty("id")
    private String id;

    @JsonProperty("clienteId")
    private String clienteId;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("publica")
    private boolean publica;

    @JsonProperty("dataCriacao")
    private String dataCriacao;

    @JsonProperty("itens")
    private List<ItemListaDesejos> itens;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPublica() {
        return publica;
    }

    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<ItemListaDesejos> getItens() {
        return itens;
    }

    public void setItens(List<ItemListaDesejos> itens) {
        this.itens = itens;
    }
}
