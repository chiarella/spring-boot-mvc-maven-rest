package br.com.chiarella.crud.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chiarella.crud.domain.Funcionario;
import br.com.chiarella.crud.repository.FuncionarioRepository;

@Service
@Transactional
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario buscaPorId(Long id) {
		Optional<Funcionario> optf = funcionarioRepository.findById(id);
		return optf.get();
	}
	
	public List<Funcionario> buscaTodos() {
		return funcionarioRepository.findAll();
	}
	
	public Double somaSalario() {
		return funcionarioRepository.findAll().stream().mapToDouble(f -> f.getSalario()).sum();
	}
	
	public Double salarioPorId(Long id) {
		Optional<Funcionario> optf = funcionarioRepository.findById(id);
		return optf.get().getSalario();
	}
	
		
	public void delete (Long id) {
		funcionarioRepository.deleteById(id);
	}
	
	public Funcionario save(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

}
