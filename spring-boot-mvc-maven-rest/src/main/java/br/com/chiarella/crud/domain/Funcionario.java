package br.com.chiarella.crud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private Integer ddd;
	private Integer telefone;
	private String cargo;
	private Double salario;	
	/*
	 * AllArgsConstructor: cria automaticamente um construtor com todas os atributos da classe como argumento.
	 * NoArgsConstructor: cria automaticamente um construtor vazio (sem argumentos).
	 * Data: cria automaticamente os métodos toString, equals, hashCode, getters e setter
	 */
	
//	public Funcionario(Long id, String nome, String sobrenome, String cpf, Integer ddd, Integer telefone, String cargo,
//			Double salario) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.sobrenome = sobrenome;
//		this.cpf = cpf;
//		this.ddd = ddd;
//		this.telefone = telefone;
//		this.cargo = cargo;
//		this.salario = salario;
//	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

}
