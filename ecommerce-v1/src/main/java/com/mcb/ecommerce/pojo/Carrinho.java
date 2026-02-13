package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Carrinho {
    @JsonProperty("id")
    private String id;

    @JsonProperty("usuarioId")
    private String usuarioId;

    @JsonProperty("itens")
    private List<ItemCarrinho> itens;

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

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }
}
