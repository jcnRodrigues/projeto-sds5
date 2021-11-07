package com.dvsuperior.dsvends.repositories;

import com.dvsuperior.dsvends.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleReposity extends JpaRepository<Sale, Long>{
    
}
