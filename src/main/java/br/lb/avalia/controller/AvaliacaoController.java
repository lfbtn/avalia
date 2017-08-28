package br.lb.avalia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.lb.admin.entity.AppConfiguration;
import br.lb.avalia.service.AvaliacaoService;

@Controller
public class AvaliacaoController {

	AppConfiguration appConfiguration = new AppConfiguration();

	@Autowired
	public AvaliacaoService avaliacaoService;

	@RequestMapping("/avaliacoes")
	public String login(Model model) {
		model.addAttribute("appName", appConfiguration.getAppName());
		model.addAttribute("avaliacoes", avaliacaoService.findAll());
		return "avaliacoes";
	}

	@RequestMapping("/avaliacoes/{id}")
	public String fornecedorDetail(Model model, @PathVariable int id) {
		model.addAttribute("appName", appConfiguration.getAppName());
		model.addAttribute("avaliacao", avaliacaoService.findOne(id));
		return "avaliacao-detail";
	}
}
