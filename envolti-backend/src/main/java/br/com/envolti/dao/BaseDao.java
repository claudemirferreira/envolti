package br.com.envolti.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.envolti.model.BaseModel;

@Repository
public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

}
