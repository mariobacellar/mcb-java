package br.com.mcb.vendas.controller.itempedido;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import br.com.mcb.vendas.domain.itempedido.ItemPedido;
import br.com.mcb.vendas.service.itempedido.ItemPedidoService;
 
 // Controller de ItemPedido
@RestController
@RequestMapping("/itens_pedido")
public class ItemPedidoController {
    private final ItemPedidoService itemPedidoService;

    public ItemPedidoController(ItemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }

    @PostMapping
    public ItemPedido criarItemPedido(@RequestBody ItemPedido itemPedido) {
        return itemPedidoService.salvarItemPedido(itemPedido);
    }

    @GetMapping
    public List<ItemPedido> listarItensPedido() {
        return itemPedidoService.listarItensPedido();
    }
}
