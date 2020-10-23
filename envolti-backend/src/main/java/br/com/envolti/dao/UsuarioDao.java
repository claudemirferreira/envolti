package br.com.envolti.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.envolti.model.Usuario;

public interface UsuarioDao extends BaseDao<Usuario> {
	
	@Query("select u from Usuario u where u.login = :login")
	public Usuario findByLogin(@Param("login") String login);

}
