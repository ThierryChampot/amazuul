package com.imie.stock.daos;

import java.util.Optional;

import com.imie.stock.entities.Product;

import org.springframework.data.repository.CrudRepository;

public class ProductDao implements CrudRepository<Product, Long> {

	@Override
	public <S extends Product> S save(S entity) {
		return null;
	}

	@Override
	public <S extends Product> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<Product> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<Product> findAll() {
		return null;
	}

	@Override
	public Iterable<Product> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		
	}

	@Override
	public void delete(Product entity) {
		
	}

	@Override
	public void deleteAll(Iterable<? extends Product> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

}