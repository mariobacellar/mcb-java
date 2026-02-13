package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCarrinho {
    @JsonProperty("produtoId")
    private String produtoId;

    @JsonProperty("quantidade")
    private int quantidade;

    // Getters and Setters
    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
