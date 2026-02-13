package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Pedido {
    @JsonProperty("id")
    private String id;

    @JsonProperty("usuarioId")
    private String usuarioId;

    @JsonProperty("itens")
    private List<ItemPedido> itens;

    @JsonProperty("dataPedido")
    private String dataPedido;

    @JsonProperty("status")
    private String status;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
