package br.com.gustavoantunes.fornecedor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavoantunes.fornecedor.dto.ItemDoPedidoDTO;
import br.com.gustavoantunes.fornecedor.model.Pedido;
import br.com.gustavoantunes.fornecedor.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
	private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);
	
	@PostMapping
	public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
		LOG.info("Pedido Recebido");
		return pedidoService.realizaPedido(produtos);
	}
	
	@RequestMapping("/{id}")
	public Pedido getPedidoPorId(@PathVariable Long id) {
		return pedidoService.getPedidoPorId(id);
	}
}
