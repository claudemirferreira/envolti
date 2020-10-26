package br.com.envolti.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.envolti.dto.FiltroPaginacaoDTO;
import br.com.envolti.model.Pessoa;
import br.com.envolti.service.PessoaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/envolti-backend/pessoa")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PessoaController extends GenericRestController<Pessoa> {
	
	@Autowired
	private PessoaService service; 
	
	@RequestMapping(value = "pesquisar", method = RequestMethod.POST)
	@ApiOperation(value = "retorna a lista de produtos")
	public Page<Pessoa> pesquisar(HttpServletResponse resp, @RequestBody FiltroPaginacaoDTO dto) {
		try {
			return service.pesquisa(dto);
		} catch (Exception e) {
			System.out.println("ocorreu um erro " + e.getMessage());
		}
		return null;
	}

}
