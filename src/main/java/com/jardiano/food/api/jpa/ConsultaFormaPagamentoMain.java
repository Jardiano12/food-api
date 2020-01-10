package com.jardiano.food.api.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.jardiano.food.api.FoodApiApplication;
import com.jardiano.food.api.domain.model.FormaPagamento;
import com.jardiano.food.api.domain.repository.FormaPagamentoRepository;

public class ConsultaFormaPagamentoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
		
		List<FormaPagamento> todasFormasPagamentos = formaPagamentoRepository.listar();
		
		for (FormaPagamento formaPagamento : todasFormasPagamentos) {
			System.out.println(formaPagamento.getDescricao());
		}
	}
	
}
