package br.com.rcintra.bibliotecadigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.rcintra.bibliotecadigital.model.Livro;
import br.com.rcintra.bibliotecadigital.repository.Livros;

@Controller
@RequestMapping("/livros")
public class LivrosController {
	
	@Autowired
	private Livros livros;

	@GetMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("CadastroLivros", "livro", new Livro());
		mv.addObject("livros", livros.findAll());
		return mv;
	}
	
	@PostMapping
	public String salvar(Livro livro) {
		livros.save(livro);
		return "redirect:/livros";
	}
}
