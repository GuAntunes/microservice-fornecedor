package br.com.gustavoantunes.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gustavoantunes.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
