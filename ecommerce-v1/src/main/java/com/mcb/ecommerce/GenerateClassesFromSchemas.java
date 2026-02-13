package com.mcb.ecommerce;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GenerateClassesFromSchemas {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        String[] schemas = {
            "AtributoProduto.json",
            "Avaliacao.json",
            "Banner.json",
            "Carrinho.json",
            "CartaoCredito.json",
            "Categoria.json",
            "Cliente.json",
            "ConfiguracaoLoja.json",
            "CupomDesconto.json",
            "Dimensao.json",
            "Endereco.json",
            "Entrega.json",
            "Estoque.json",
            "Fornecedor.json",
            "ImagemProduto.json",
            "ItemCarrinho.json",
            "ItemListaDesejos.json",
            "ItemPedido.json",
            "ListaDesejos.json",
            "Log.json",
            "Marca.json",
            "MovimentacaoEstoque.json",
            "Newsletter.json",
            "Notificacao.json",
            "Pagamento.json",
            "Pedido.json",
            "Produto.json",
            "Usuario.json"
        };

        for (String schema : schemas) {
            try {
                String json = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("src/main/resources/schemas/" + schema)));
                // Call the appropriate method based on the schema name
                switch (schema) {
                    case "AtributoProduto.json":
                        JsonToJava.fromJsonToAtributoProduto(json);
                        break;
                    case "Avaliacao.json":
                        JsonToJava.fromJsonToAvaliacao(json);
                        break;
                    case "Banner.json":
                        JsonToJava.fromJsonToBanner(json);
                        break;
                    case "Carrinho.json":
                        JsonToJava.fromJsonToCarrinho(json);
                        break;
                    case "CartaoCredito.json":
                        JsonToJava.fromJsonToCartaoCredito(json);
                        break;
                    case "Categoria.json":
                        JsonToJava.fromJsonToCategoria(json);
                        break;
                    case "Cliente.json":
                        JsonToJava.fromJsonToCliente(json);
                        break;
                    case "ConfiguracaoLoja.json":
                        JsonToJava.fromJsonToConfiguracaoLoja(json);
                        break;
                    case "CupomDesconto.json":
                        JsonToJava.fromJsonToCupomDesconto(json);
                        break;
                    case "Dimensao.json":
                        JsonToJava.fromJsonToDimensao(json);
                        break;
                    case "Endereco.json":
                        JsonToJava.fromJsonToEndereco(json);
                        break;
                    case "Entrega.json":
                        JsonToJava.fromJsonToEntrega(json);
                        break;
                    case "Estoque.json":
                        JsonToJava.fromJsonToEstoque(json);
                        break;
                    case "Fornecedor.json":
                        JsonToJava.fromJsonToFornecedor(json);
                        break;
                    case "ImagemProduto.json":
                        JsonToJava.fromJsonToImagemProduto(json);
                        break;
                    case "ItemCarrinho.json":
                        JsonToJava.fromJsonToItemCarrinho(json);
                        break;
                    case "ItemListaDesejos.json":
                        JsonToJava.fromJsonToItemListaDesejos(json);
                        break;
                    case "ItemPedido.json":
                        JsonToJava.fromJsonToItemPedido(json);
                        break;
                    case "ListaDesejos.json":
                        JsonToJava.fromJsonToListaDesejos(json);
                        break;
                    case "Log.json":
                        JsonToJava.fromJsonToLog(json);
                        break;
                    case "Marca.json":
                        JsonToJava.fromJsonToMarca(json);
                        break;
                    case "MovimentacaoEstoque.json":
                        JsonToJava.fromJsonToMovimentacaoEstoque(json);
                        break;
                    case "Newsletter.json":
                        JsonToJava.fromJsonToNewsletter(json);
                        break;
                    case "Notificacao.json":
                        JsonToJava.fromJsonToNotificacao(json);
                        break;
                    case "Pagamento.json":
                        JsonToJava.fromJsonToPagamento(json);
                        break;
                    case "Pedido.json":
                        JsonToJava.fromJsonToPedido(json);
                        break;
                    case "Produto.json":
                        JsonToJava.fromJsonToProduto(json);
                        break;
                    case "Usuario.json":
                        JsonToJava.fromJsonToUsuario(json);
                        break;
                    default:
                        System.out.println("No matching class for schema: " + schema);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
