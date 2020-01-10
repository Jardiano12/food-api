package com.jardiano.food.api.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardiano.food.api.domain.exception.EntidadeNaoEncontradaException;
import com.jardiano.food.api.domain.model.Cozinha;
import com.jardiano.food.api.domain.model.Restaurante;
import com.jardiano.food.api.domain.repository.CozinhaRepository;
import com.jardiano.food.api.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;

	@Autowired
	private CozinhaRepository cozinhaRepository;

	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();

		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException(
						String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));

		restaurante.setCozinha(cozinha);

		return restauranteRepository.salvar(restaurante);
	}

}
