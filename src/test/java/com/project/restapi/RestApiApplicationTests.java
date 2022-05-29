package com.project.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.project.restapi.entity.Cliente;
import com.project.restapi.entity.Endereco;
import com.project.restapi.repository.ClienteRepository;
import com.project.restapi.repository.EnderecoRepository;
import com.project.restapi.service.CepService;
import com.project.restapi.service.impl.ClienteServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	EnderecoRepository enderecoRepository;
	@Autowired
	CepService CepService;
	@Test
	public void testCreate() {
		Cliente cliente = new Cliente();
		clienteRepository.save(cliente);
		assertNotNull(clienteRepository.findById((long) 1));
	}

	@Test
	public void testViaCEP() {
		Endereco endereco = CepService.consultarCep("90020180");
		assertEquals("Centro Histórico", endereco.getBairro());
	}

}
