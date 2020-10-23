package br.com.envolti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.envolti.model.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends GenericRestController<Usuario> {

}