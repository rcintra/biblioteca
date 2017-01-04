package br.com.rcintra.bibliotecadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rcintra.bibliotecadigital.model.Livro;

public interface Livros extends JpaRepository<Livro, Long>{

}
