package br.com.gustavoantunes.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavoantunes.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado);

}
