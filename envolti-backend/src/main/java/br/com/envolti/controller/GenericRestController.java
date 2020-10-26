package br.com.envolti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.envolti.dao.BaseDao;
import br.com.envolti.model.BaseModel;
import br.com.envolti.response.Response;

@CrossOrigin(origins = "*")
public class GenericRestController<T extends BaseModel> {
	
	@Autowired
	private BaseDao<T> dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Response<List<T>>> list() {
		Response<List<T>> response = new Response<List<T>>();
		List<T> list = dao.findAll();
		response.setContent(list);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public T create(@RequestBody T entity) {
		return dao.save(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
		return dao.save(entity);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") long id) {
		dao.delete(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public T get(@PathVariable(value = "id") long id) {
		return dao.getOne(id);
	}
}
