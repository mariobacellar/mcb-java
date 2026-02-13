package br.com.mcb.vendas.service.pedido;

//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.mcb.vendas.domain.pedido.Pedido;
//import br.com.mcb.vendas.domain.pedido.PedidoQuery;
//import br.com.mcb.vendas.repo.pedido.PedidoQueryRepository;
import br.com.mcb.vendas.repo.pedido.PedidoRepository;

 // Serviço de Pedido
@Service
public class PedidoService {
    
    private final PedidoRepository pedidoRepository;
    //private final PedidoQueryRepository pedidoQueryRepository;

/* 
    public PedidoService(PedidoRepository pedidoRepository, PedidoQueryRepository pedidoQueryRepository) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoQueryRepository = pedidoQueryRepository;
    }
*/
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    @Transactional
    public Long criarPedido(Pedido pedido) {
        Pedido savedPedido = pedidoRepository.save(pedido);
        //PedidoQuery pedidoQuery = new PedidoQuery();
        //pedidoQueryRepository.save(pedidoQuery);
        return savedPedido.getId();
    }
}
