package br.lb.avalia.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.lb.admin.entity.AppConfiguration;
import br.lb.avalia.entity.Avaliacao;
import br.lb.avalia.entity.Pergunta;
import br.lb.avalia.service.AvaliacaoService;
import br.lb.avalia.service.PerguntaService;
import br.lb.avalia.service.RespostaService;

@Controller
public class AvaliacaoController {

	AppConfiguration appConfiguration = new AppConfiguration();

	@Autowired
	public AvaliacaoService avaliacaoService;
	
	@Autowired
	public PerguntaService perguntaService;
	
	@Autowired
	public RespostaService respostaService;

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
		Avaliacao ava = avaliacaoService.findOne(id);
		System.out.println(ava.getId());
		//System.out.println(ava.getPerguntas().get(0).getPergunta());
		//System.out.println(ava.getPerguntas().get(0).getRespostas().get(0).getTexto());
		model.addAttribute("perguntas", perguntaService.findAll());
		Pergunta pergunta = perguntaService.findOne(id);
		System.out.println(pergunta.getPergunta());
		model.addAttribute("respostas", respostaService.findAll());
		return "avaliacao-detail";
	}
	
	@RequestMapping("/avaliacao-register")
	public String showAvaliacaoRegister(Model model) {
		//model.addAttribute("hoje", dataAtual());
		return "avaliacao-register";
	}
	
	/*@RequestMapping(value = "/fornecedor-register", method = RequestMethod.POST)
	public String doOrcamentoRegister(Model model, @RequestParam String nome, @RequestParam String idLegal,
			@RequestParam(defaultValue = "N/A", required = false) String logradouro,
			@RequestParam(defaultValue = "N/A", required = false) String bairro,
			@RequestParam(defaultValue = "N/A", required = false) String cep, @RequestParam String fone,
			@RequestParam(defaultValue = "N/A", required = false) String cidade, @RequestParam String uf,
			@RequestParam(defaultValue = "N/A", required = false) String inscricaoEstadual,
			@RequestParam String nomeFantasia, @RequestParam String razaoSocial,
			@RequestParam java.sql.Date datadeIngresso,
			@RequestParam(defaultValue = "-1", required = false) int avaliacaoFornecedor, @RequestParam String descricao,
			@RequestParam(defaultValue = "N/A", required = false) String nomeVendedor,
			@RequestParam(defaultValue = "N/A", required = false) String foneVendedor,
			@RequestParam(defaultValue = "N/A", required = false) String emailVendedor,
			@RequestParam(defaultValue = "N/A", required = false) String email) {

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome(nome);
		fornecedor.setIdLegal(idLegal);
		fornecedor.setLogradouro(logradouro);
		fornecedor.setBairro(bairro);
		fornecedor.setCep(cep);
		fornecedor.setFone(fone);
		fornecedor.setCidade(cidade);
		fornecedor.setUf(uf);
		fornecedor.setInscricaoEstadual(inscricaoEstadual);
		fornecedor.setNomeFantasia(nomeFantasia);
		fornecedor.setRazaoSocial(razaoSocial);
		fornecedor.setDatadeIngresso(datadeIngresso);
		fornecedor.setAvaliacaoFornecedor(avaliacaoFornecedor);
		fornecedor.setDescricao(descricao);
		fornecedor.setEmail(email);
		fornecedor.setNomeVendedor(nomeVendedor);
		fornecedor.setEmailVendedor(emailVendedor);
		fornecedor.setFoneVendedor(foneVendedor);
		fornecedorService.save(fornecedor);
		return "redirect:/fornecedores.html";
	}*/
	
	public String dataAtual() {
		String formatoData = "yyyy-MM-dd";
		String dataHoraAtual = "";
		java.util.Date agora = new java.util.Date();
		SimpleDateFormat formata = new SimpleDateFormat(formatoData);
		dataHoraAtual = formata.format(agora);
		return dataHoraAtual;
	}
}
