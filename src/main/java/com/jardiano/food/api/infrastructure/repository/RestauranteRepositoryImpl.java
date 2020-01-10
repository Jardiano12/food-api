package com.jardiano.food.api.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jardiano.food.api.domain.model.Restaurante;
import com.jardiano.food.api.domain.repository.RestauranteRepository;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Restaurante> listar() {
		return manager.createQuery("from Restaurante", Restaurante.class)
				.getResultList();
	}
	
	@Override
	public Restaurante buscar(Long id) {
		return manager.find(Restaurante.class, id);
	}
	
	@Transactional
	@Override
	public Restaurante salvar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}
	
	@Transactional
	@Override
	public void remover(Restaurante restaurante) {
		restaurante = buscar(restaurante.getId());
		manager.remove(restaurante);
	}

}
