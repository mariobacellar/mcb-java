package br.com.mcb.vendas.controller.pedido;

import br.com.mcb.vendas.domain.pedido.Pedido;
import br.com.mcb.vendas.domain.pedido.PedidoQuery;
import br.com.mcb.vendas.repo.pedido.PedidoQueryRepository;
import br.com.mcb.vendas.repo.pedido.PedidoRepository;
import br.com.mcb.vendas.service.pedido.PedidoService;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller de Pedido
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;
    private final PedidoQueryRepository pedidoQueryRepository;
    
    public PedidoController(PedidoService pedidoService, PedidoQueryRepository pedidoQueryRepository,
            PedidoRepository pedidoRepository) {
        this.pedidoService = pedidoService;
        this.pedidoQueryRepository = pedidoQueryRepository;
    }

    @PostMapping
    public Long  criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    @Transactional(readOnly = true)
    public List<PedidoQuery> listarPedidos() {
        return pedidoQueryRepository.findAll();
    }
}
