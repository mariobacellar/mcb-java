package com.mcb.ecommerce;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcb.ecommerce.pojo.*;

public class JsonToJava {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Cliente fromJsonToCliente(String json) throws Exception {
        return objectMapper.readValue(json, Cliente.class);
    }

    public static Fornecedor fromJsonToFornecedor(String json) throws Exception {
        return objectMapper.readValue(json, Fornecedor.class);
    }

    public static Estoque fromJsonToEstoque(String json) throws Exception {
        return objectMapper.readValue(json, Estoque.class);
    }

    public static Avaliacao fromJsonToAvaliacao(String json) throws Exception {
        return objectMapper.readValue(json, Avaliacao.class);
    }

    public static Dimensao fromJsonToDimensao(String json) throws Exception {
        return objectMapper.readValue(json, Dimensao.class);
    }

    public static AtributoProduto fromJsonToAtributoProduto(String json) throws Exception {
        return objectMapper.readValue(json, AtributoProduto.class);
    }

    public static Produto fromJsonToProduto(String json) throws Exception {
        return objectMapper.readValue(json, Produto.class);
    }

    public static Pagamento fromJsonToPagamento(String json) throws Exception {
        return objectMapper.readValue(json, Pagamento.class);
    }

    public static Notificacao fromJsonToNotificacao(String json) throws Exception {
        return objectMapper.readValue(json, Notificacao.class);
    }

    public static Newsletter fromJsonToNewsletter(String json) throws Exception {
        return objectMapper.readValue(json, Newsletter.class);
    }

    public static MovimentacaoEstoque fromJsonToMovimentacaoEstoque(String json) throws Exception {
        return objectMapper.readValue(json, MovimentacaoEstoque.class);
    }

    public static Marca fromJsonToMarca(String json) throws Exception {
        return objectMapper.readValue(json, Marca.class);
    }

    public static Log fromJsonToLog(String json) throws Exception {
        return objectMapper.readValue(json, Log.class);
    }

    public static ItemPedido fromJsonToItemPedido(String json) throws Exception {
        return objectMapper.readValue(json, ItemPedido.class);
    }

    public static ListaDesejos fromJsonToListaDesejos(String json) throws Exception {
        return objectMapper.readValue(json, ListaDesejos.class);
    }

    public static ItemListaDesejos fromJsonToItemListaDesejos(String json) throws Exception {
        return objectMapper.readValue(json, ItemListaDesejos.class);
    }

    public static Carrinho fromJsonToCarrinho(String json) throws Exception {
        return objectMapper.readValue(json, Carrinho.class);
    }

    public static Banner fromJsonToBanner(String json) throws Exception {
        return objectMapper.readValue(json, Banner.class);
    }

    public static CupomDesconto fromJsonToCupomDesconto(String json) throws Exception {
        return objectMapper.readValue(json, CupomDesconto.class);
    }

    public static ConfiguracaoLoja fromJsonToConfiguracaoLoja(String json) throws Exception {
        return objectMapper.readValue(json, ConfiguracaoLoja.class);
    }

    public static Entrega fromJsonToEntrega(String json) throws Exception {
        return objectMapper.readValue(json, Entrega.class);
    }

    public static Categoria fromJsonToCategoria(String json) throws Exception {
        return objectMapper.readValue(json, Categoria.class);
    }

    public static ItemCarrinho fromJsonToItemCarrinho(String json) throws Exception {
        return objectMapper.readValue(json, ItemCarrinho.class);
    }

    public static ImagemProduto fromJsonToImagemProduto(String json) throws Exception {
        return objectMapper.readValue(json, ImagemProduto.class);
    }

    public static CartaoCredito fromJsonToCartaoCredito(String json) throws Exception {
        return objectMapper.readValue(json, CartaoCredito.class);
    }

    // New methods for missing classes
    public static Usuario fromJsonToUsuario(String json) throws Exception {
        return objectMapper.readValue(json, Usuario.class);
    }

    public static Endereco fromJsonToEndereco(String json) throws Exception {
        return objectMapper.readValue(json, Endereco.class);
    }

    // New method for ItemPedido
    public static Pedido fromJsonToPedido(String json) throws Exception {
        return objectMapper.readValue(json, Pedido.class);
    }
}
