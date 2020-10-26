package br.com.envolti.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import br.com.envolti.model.Pessoa;

public interface PessoaDao extends BaseDao<Pessoa> {
	
	@Query("SELECT u FROM Pessoa u WHERE nome like ?1")
	Page<Pessoa> pesquisa(String nome, Pageable pageable);

}
