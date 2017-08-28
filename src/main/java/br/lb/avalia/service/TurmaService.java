package br.lb.avalia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.lb.avalia.entity.Turma;
import br.lb.avalia.repository.TurmaRepository;

@Service
public class TurmaService {
	private static final int page_size = 10;

	@Autowired
	private TurmaRepository turmaRepository;

	public Page<Turma> findAllPage(Integer pageNumber) {
		PageRequest request = new PageRequest(pageNumber, page_size, Sort.Direction.ASC, "id");
		return turmaRepository.findAll(request);
	}
}