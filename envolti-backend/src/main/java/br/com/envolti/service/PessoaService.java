package br.com.envolti.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.envolti.dao.PessoaDao;
import br.com.envolti.dto.FiltroPaginacaoDTO;
import br.com.envolti.model.Pessoa;

@Service
public class PessoaService {

	@Autowired
	PessoaDao dao;

	public Pessoa salvar(Pessoa entity) {
		System.out.println("entrou no logar");
		entity.setDataCadastro(new Date());
		entity.setDataAtualizacao(null);
		return dao.save(entity);

	}

	public Pessoa atualizar(Pessoa entity) {
		entity.setDataAtualizacao(new Date());
		return dao.save(entity);
	}
	
	public Page<Pessoa> pesquisa(FiltroPaginacaoDTO dto) {
		System.out.println(dto.toString());
		Pageable pageable = new PageRequest(dto.getPage(), dto.getSize(), Sort.Direction.ASC, ("nome"));
		return dao.pesquisa(dto.getNome() + "%", pageable);
	}

}
