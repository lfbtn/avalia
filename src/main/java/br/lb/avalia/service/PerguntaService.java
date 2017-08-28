package br.lb.avalia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.lb.avalia.entity.Pergunta;
import br.lb.avalia.repository.PerguntaRepository;

@Service
public class PerguntaService {

	private static final int page_size = 10;

	@Autowired
	private PerguntaRepository perguntaRepository;

	public Page<Pergunta> findAllPage(Integer pageNumber) {
		PageRequest request = new PageRequest(pageNumber, page_size, Sort.Direction.ASC, "id");
		return perguntaRepository.findAll(request);
	}
	
	public List<Pergunta> findAll() {
		return perguntaRepository.findAll();
	}
}
