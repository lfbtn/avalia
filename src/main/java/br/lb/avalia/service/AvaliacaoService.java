package br.lb.avalia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.lb.avalia.entity.Avaliacao;
import br.lb.avalia.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {

	private static final int page_size = 10;

	@Autowired
	private AvaliacaoRepository avaliacaoRepository;

	public Page<Avaliacao> findAllPage(Integer pageNumber) {
		PageRequest request = new PageRequest(pageNumber, page_size, Sort.Direction.ASC, "id");
		return avaliacaoRepository.findAll(request);
	}
	
	public List<Avaliacao> findAll() {
		return avaliacaoRepository.findAll();
	}
	
	public Avaliacao findOne(int id){
		return avaliacaoRepository.findOne(id);
	}
	
}
