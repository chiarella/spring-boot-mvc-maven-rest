package br.com.chiarella.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.chiarella.crud.domain.Funcionario;
import br.com.chiarella.crud.repository.FuncionarioRepository;
import br.com.chiarella.crud.service.FuncionarioService;

@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	

	@ResponseBody
	@GetMapping(value = "/about")
	public ResponseEntity<String> about(){
		return new ResponseEntity<String>("Aplicação de cadastro de funcionários.", HttpStatus.OK);
	}
	
	@ResponseBody
	@GetMapping(value = "/funcionario/{id}")
	public ResponseEntity<Funcionario> buscaPorId(@PathVariable("id") Long id){
		return new ResponseEntity<Funcionario>(funcionarioService.buscaPorId(id), HttpStatus.OK);
	}
	
	@ResponseBody
	@GetMapping(value = "/funcionarios")
	public ResponseEntity<List<Funcionario>> buscaTodos(){
		return new ResponseEntity<List<Funcionario>>(funcionarioService.buscaTodos(), HttpStatus.OK);
	}
	
	@ResponseBody
	@GetMapping(value = "/salarios")
	public ResponseEntity<Double>  somaSalario(){
		return new ResponseEntity<Double>(funcionarioService.somaSalario(), HttpStatus.OK);
	}
	@ResponseBody
	@GetMapping(value = "/salario/{id}")
	public ResponseEntity<Double> salarioPorId(@PathVariable("id") Long id){
		return new ResponseEntity<Double>(funcionarioService.salarioPorId(id), HttpStatus.OK);
	}
	@ResponseBody
	@GetMapping(value="/delete/{id}")
 	public ResponseEntity<Void> delete(@PathVariable Long id){
		funcionarioService.delete(id);
		return ResponseEntity.noContent().build();
	}
	@RequestMapping(value = "/add", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
	public Funcionario insert( @RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
		//new ResponseEntity<Funcionario>(funcionarioService.save(), HttpStatus.OK);
  }

}
