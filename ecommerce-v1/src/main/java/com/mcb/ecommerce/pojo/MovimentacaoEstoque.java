package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovimentacaoEstoque {
    @JsonProperty("id")
    private String id;

    @JsonProperty("estoqueId")
    private String estoqueId;

    @JsonProperty("quantidade")
    private int quantidade;

    @JsonProperty("tipoMovimentacao")
    private String tipoMovimentacao; // e.g., "entrada" or "saida"

    @JsonProperty("dataMovimentacao")
    private String dataMovimentacao;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(String estoqueId) {
        this.estoqueId = estoqueId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(String dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
}
