package com.devsuperior.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
