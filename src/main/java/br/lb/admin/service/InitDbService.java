package br.lb.admin.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.lb.admin.entity.News;
import br.lb.admin.entity.Role;
import br.lb.admin.entity.User;
import br.lb.admin.repository.NewsRepository;
import br.lb.admin.repository.RoleRepository;
import br.lb.admin.repository.UserRepository;
import br.lb.avalia.entity.Avaliacao;
import br.lb.avalia.entity.Pergunta;
import br.lb.avalia.entity.Resposta;
import br.lb.avalia.entity.Turma;
import br.lb.avalia.repository.AvaliacaoRepository;
import br.lb.avalia.repository.PerguntaRepository;
import br.lb.avalia.repository.RespostaRepository;
import br.lb.avalia.repository.TurmaRepository;

//import br.lb.admin.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private NewsRepository newsRepository;

	@Autowired
	private TurmaRepository turmaRepository;

	@Autowired
	private AvaliacaoRepository avaliacaoRepository;
	
	@Autowired
	private PerguntaRepository perguntaRepository;
	
	@Autowired
	private RespostaRepository respostaRepository;

	@PostConstruct
	public void init() throws ParseException {

		if (userRepository.findAll().isEmpty()) {

			usersTest();

			newsTest();

		} else {

		}

	}

	private void newsTest() {
		News news = new News();
		news.setTitle("Grande evento começa dia 03 de abril!");
		news.setText("O grande evento stá em sua 16ª edição. Organizada pela organizadora, "
				+ "tem crescido a cada ano, tanto em número de expositores e de "
				+ "comercialização de produtos, quanto em quantitativo de visitantes. ");
		news.setFotografo("Luiz Botton");
		news.setVisivel(true);
		news.setImagem("http://www.pensamentoverde.com.br/wp-content/uploads/2014/02/img19.jpg");
		news.setCategoria1("Notícias");
		news.setCategoria2("Eventos");
		news.setCategoria3("");
		newsRepository.save(news);
	}

	private void usersTest() throws ParseException {
		User sysAdmin;
		Role adminRole;
		Role holeriteRole;
		adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		sysAdmin = new User();
		sysAdmin.setName("Luiz Botton");
		List<Role> rolesAdmin = new ArrayList<Role>();
		rolesAdmin.add(adminRole);
		sysAdmin.setRoles(rolesAdmin);
		sysAdmin.setEmail("luizbotton@gmail.com");

		sysAdmin.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		sysAdmin.setPassword(encoder.encode("lb2002"));
		sysAdmin.setCpf("00484779079");

		userRepository.save(sysAdmin);

		User admin = new User();
		admin.setName("admin");
		admin.setRoles(rolesAdmin);
		admin.setEmail("admin@admin.com.br");

		admin.setEnabled(true);
		encoder = new BCryptPasswordEncoder();
		admin.setPassword(encoder.encode("1234"));
		admin.setCpf("0123456789");

		userRepository.save(admin);

		User vanessa = new User();
		vanessa.setName("Vanessa Camargo");
		vanessa.setRoles(rolesAdmin);
		vanessa.setCpf("01234567890");
		vanessa.setPassword(encoder.encode("1234"));
		vanessa.setEmail("vanessaxcamargo@gmail.com");

		userRepository.save(vanessa);

		Turma turma1 = new Turma();
		turma1.setAno(2018);
		turma1.setSemestre(1);
		turma1.setNome("01A");
		// turma1.setProfessor(vanessa);
		turma1.setProfessor("Vanessa Camargo");
		turma1.setDisciplina("Sistemas Operacionais");

		ArrayList<User> alunos = new ArrayList<User>();
		alunos.add(sysAdmin);
		turma1.setAlunos(alunos);

		turmaRepository.save(turma1);

		ArrayList<Turma> turmas = new ArrayList<Turma>();
		turmas.add(turma1);
		sysAdmin.setTurmas(turmas);

		userRepository.save(sysAdmin);

		Avaliacao prova1 = new Avaliacao();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-03-2018 10:20:56";
		Date date = sdf.parse(dateInString);

		prova1.setAplicacao(date);
		prova1.setInclusao(new Date());
		prova1.setDescricao("Primeira avaliação, semáforos, análise da estrutura básica de um sisop.");
		prova1.setDificuldade("Média");
		prova1.setProfessor("Vanessa Camargo");
		prova1.setDisciplina("Sistemas Operacionais");
		// prova1.setProfessor(vanessa);

		avaliacaoRepository.save(prova1);

		Pergunta pergunta1 = new Pergunta();
		pergunta1.setPergunta(
				"O SISOP possui um conjunto de rotinas que "
				+ "possibilita a comunicação com qualquer dispositivo que possa ser "
				+ "conectado ao computador. Esse conjunto de rotinas faz parte do:");
		pergunta1.setAutor("Vanessa Camargo");
		pergunta1.setFonte("Tanenbaum");
		
		Resposta resposta11 = new Resposta();
		resposta11.setTexto("device driver");
		resposta11.setIsCerta(false);
		resposta11.setPergunta(pergunta1);
		
		Resposta resposta12 = new Resposta();
		resposta12.setTexto("dispositivo de E/S");
		resposta12.setIsCerta(false);
		resposta12.setPergunta(pergunta1);
		
		Resposta resposta13 = new Resposta();
		resposta13.setTexto("subsistema de E/S");
		resposta13.setIsCerta(true);
		resposta13.setPergunta(pergunta1);
		
		Resposta resposta14 = new Resposta();
		resposta14.setTexto("sistema de arquivos");
		resposta14.setIsCerta(false);
		resposta14.setPergunta(pergunta1);
		
		Resposta resposta15 = new Resposta();
		resposta15.setTexto("sistema de bufferização");
		resposta15.setIsCerta(false);
		resposta15.setPergunta(pergunta1);
		
		ArrayList<Resposta> respostas = new ArrayList<>();
		respostas.add(resposta11);respostas.add(resposta12);respostas.add(resposta13);respostas.add(resposta14);respostas.add(resposta15);
		
		pergunta1.setRespostas(respostas);
		
		perguntaRepository.save(pergunta1);
		
		respostaRepository.save(resposta11);
		respostaRepository.save(resposta12);
		respostaRepository.save(resposta13);
		respostaRepository.save(resposta14);
		respostaRepository.save(resposta15);
		
		
		
	}

}
