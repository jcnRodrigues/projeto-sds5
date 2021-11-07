package com.dvsuperior.dsvends.repositories;

import java.util.List;

import com.dvsuperior.dsvends.dto.SaleSuccessDTO;
import com.dvsuperior.dsvends.dto.SaleSumDTO;
import com.dvsuperior.dsvends.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface SaleReposity extends JpaRepository<Sale, Long>{
    @Query("SELECT new com.dvsuperior.dsvends.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
    + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.dvsuperior.dsvends.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
    + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();

}
