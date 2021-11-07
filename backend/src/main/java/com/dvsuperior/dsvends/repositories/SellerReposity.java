package com.dvsuperior.dsvends.repositories;

import com.dvsuperior.dsvends.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerReposity extends JpaRepository<Seller, Long>{
    
}
