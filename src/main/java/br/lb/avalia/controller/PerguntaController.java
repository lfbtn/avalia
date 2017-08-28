package br.lb.avalia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.lb.admin.entity.AppConfiguration;
import br.lb.avalia.service.PerguntaService;

@Controller
public class PerguntaController {
	
	AppConfiguration appConfiguration = new AppConfiguration();

	@Autowired
	public PerguntaService perguntaService;

	@RequestMapping("/perguntas")
	public String login(Model model) {
		model.addAttribute("appName", appConfiguration.getAppName());
		model.addAttribute("perguntas", perguntaService.findAll());
		return "perguntas";
	}

}
