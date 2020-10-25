package br.com.envolti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.envolti.FiltroPaginacaoDTO;
import br.com.envolti.dao.PessoaDao;
import br.com.envolti.model.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController extends GenericRestController<Pessoa> {

	@Autowired
	PessoaDao pessoaDao;

	@PostMapping(value = "/pesquisar")
	public Page<Pessoa> pesquisar(@RequestBody FiltroPaginacaoDTO dto) {
		Pageable pageable = new PageRequest(dto.getPage(), dto.getSize(), Sort.Direction.ASC, "nome");
		return pessoaDao.pesquisa(dto.getNome(), pageable);
	}

}
