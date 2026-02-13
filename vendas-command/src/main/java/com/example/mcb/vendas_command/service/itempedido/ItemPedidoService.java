package br.com.mcb.vendas.service.itempedido;

import org.springframework.stereotype.Service;

import br.com.mcb.vendas.domain.itempedido.ItemPedido;
import br.com.mcb.vendas.repo.itempedido.ItemPedidoRepository;

import java.util.List;
 
// Serviço de ItemPedido
@Service
public class ItemPedidoService {
    private final ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public ItemPedido salvarItemPedido(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public List<ItemPedido> listarItensPedido() {
        return itemPedidoRepository.findAll();
    }
}
