package br.com.envolti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pessoa")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // json config
public class Pessoa extends BaseModel {

	private static final long serialVersionUID = -8746574861978321194L;

	@Column(length = 60, nullable = false)
	private String nome;

	@Column(length = 1)
	private String sexo;

	@Column(length = 100)
	private String email;

	@Column(length = 60)
	private String naturalidade;

	@Column(length = 60)
	private String nacionalidade;

	@Column(length = 11, nullable = false)
	private String cpf;

	@Column(nullable = false)
	private LocalDate dataCadastro;

	@Column()
	private LocalDate dataAtualizacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Pessoa(Integer id, String nome, String sexo, String email, String naturalidade, String nacionalidade,
			String cpf) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.cpf = cpf;
	}

	public Pessoa() {
	}

}
