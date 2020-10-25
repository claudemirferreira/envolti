package br.com.envolti.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.envolti.dao.PessoaDao;
import br.com.envolti.model.Pessoa;

@Service
public class PessoaService {

	@Autowired
	PessoaDao dao;

	public Pessoa save(Pessoa pessoa) {
		pessoa.setDataCadastro(new Date());
		pessoa.setDataAtualizacao(null);
		return dao.save(pessoa);
	}

	public Pessoa update(Pessoa pessoa) {
		pessoa.setDataAtualizacao(new Date());
		return dao.save(pessoa);
	}

}
