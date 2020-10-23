package br.com.envolti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.envolti.dao.UsuarioDao;
import br.com.envolti.model.Usuario;
import br.com.envolti.security.jwt.JwtUserFactory;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	UsuarioDao dao;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		System.out.println("entrou no logar");
		Usuario usuario = dao.findByLogin(login);
		if (usuario == null) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'.", login));
		} else {
			return JwtUserFactory.create(usuario);
		}
	}

	public Usuario findByLogin(String login) {
		return dao.findByLogin(login);
	}

}
