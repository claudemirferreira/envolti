package br.com.envolti.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.envolti.EnvoltiApplication;
import br.com.envolti.dao.UsuarioDao;
import br.com.envolti.model.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EnvoltiApplication.class)
public class ApplicationTests {

	@Autowired
	UsuarioDao usuarioDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void cadastrarUsuarioAdmin() {
		Usuario usuario = new Usuario(null, "Administrador", "admin", passwordEncoder.encode("admin"));
		usuarioDao.save(usuario);

	}

}
