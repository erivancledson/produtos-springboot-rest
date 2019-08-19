package com.erivan.produtorest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erivan.produtorest.model.Produto;
import com.erivan.produtorest.repository.ProdutoRepository;

@RestController
//@RequestMapping(value="/api")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	//lista de produtos
	@GetMapping("/produtos")
	public List<Produto> listaProduto(){
		
		return produtoRepository.findAll();
	}
	@GetMapping("/produto/{codigo}")
	public Produto listaProdutoUnico(@PathVariable(value="codigo") long codigo) {
		return produtoRepository.findByCodigo(codigo);
	}
	
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto);
		
	}
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody @Valid Produto produto) {
		produtoRepository.delete(produto);
	}
	@PutMapping("/produto")
	public Produto atualizaProduto(@RequestBody @Valid Produto produto) {
		return produtoRepository.save(produto);
	}

}
