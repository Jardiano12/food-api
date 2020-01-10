package com.jardiano.food.api.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.jardiano.food.api.FoodApiApplication;
import com.jardiano.food.api.domain.model.Cozinha;
import com.jardiano.food.api.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");

		for (int i = 0; i <= 10; i++) {
			cozinhaRepository.salvar(cozinha);
		}
	}
	
}
