package br.lb.avalia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.lb.avalia.entity.Resposta;
import br.lb.avalia.repository.RespostaRepository;

@Service
public class RespostaService {
	
	private static final int page_size = 10;

	@Autowired
	private RespostaRepository respostaRepository;

	public Page<Resposta> findAllPage(Integer pageNumber) {
		PageRequest request = new PageRequest(pageNumber, page_size, Sort.Direction.ASC, "id");
		return respostaRepository.findAll(request);
	}
	
	public List<Resposta> findAll() {
		return respostaRepository.findAll();
	}
}

