package com.ProjetoGerenciamentoLivro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoGerenciamentoLivro.entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long>{

}
