package br.com.envolti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.envolti.model.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController extends GenericRestController<Pessoa> {

}
