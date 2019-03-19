package com.erivan.produtorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erivan.produtorest.model.Produto;


public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	Produto findByCodigo(long codigo);

}
