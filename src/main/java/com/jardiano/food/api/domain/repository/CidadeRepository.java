package com.jardiano.food.api.domain.repository;

import java.util.List;

import com.jardiano.food.api.domain.model.Cidade;

public interface CidadeRepository {

	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Long id);
	
}
