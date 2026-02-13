package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemListaDesejos {
    @JsonProperty("id")
    private String id;

    @JsonProperty("listaDesejosId")
    private String listaDesejosId;

    @JsonProperty("produtoId")
    private String produtoId;

    @JsonProperty("dataAdicao")
    private String dataAdicao;

    @JsonProperty("observacao")
    private String observacao;

    @JsonProperty("prioridade")
    private int prioridade;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListaDesejosId() {
        return listaDesejosId;
    }

    public void setListaDesejosId(String listaDesejosId) {
        this.listaDesejosId = listaDesejosId;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public String getDataAdicao() {
        return dataAdicao;
    }

    public void setDataAdicao(String dataAdicao) {
        this.dataAdicao = dataAdicao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
