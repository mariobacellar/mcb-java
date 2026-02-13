package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemPedido {
    @JsonProperty("id")
    private String id;

    @JsonProperty("pedidoId")
    private String pedidoId;

    @JsonProperty("produtoId")
    private String produtoId;

    @JsonProperty("quantidade")
    private int quantidade;

    @JsonProperty("precoUnitario")
    private double precoUnitario;

    @JsonProperty("precoTotal")
    private double precoTotal;

    @JsonProperty("descontoUnitario")
    private double descontoUnitario;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

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

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getDescontoUnitario() {
        return descontoUnitario;
    }

    public void setDescontoUnitario(double descontoUnitario) {
        this.descontoUnitario = descontoUnitario;
    }
}
