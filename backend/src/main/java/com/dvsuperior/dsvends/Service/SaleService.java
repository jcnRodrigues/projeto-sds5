package com.dvsuperior.dsvends.Service;

import java.util.List;

import com.dvsuperior.dsvends.dto.SaleDTO;
import com.dvsuperior.dsvends.dto.SaleSuccessDTO;
import com.dvsuperior.dsvends.dto.SaleSumDTO;
import com.dvsuperior.dsvends.entities.Sale;
import com.dvsuperior.dsvends.repositories.SaleReposity;
import com.dvsuperior.dsvends.repositories.SellerReposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;





@Service
public class SaleService {

@Autowired
private SaleReposity repository;
@Autowired
private SellerReposity sellerReposity;

@Transactional(readOnly = true)
public Page<SaleDTO> findAll(Pageable pageable){
    sellerReposity.findAll();
    Page<Sale> result = repository.findAll(pageable);
    return result.map(x -> new SaleDTO(x));
}

@Transactional(readOnly = true)
public List<SaleSumDTO> amountGroupedBySeller(){
    return repository.amountGroupedBySeller();
}

@Transactional(readOnly = true)
public List<SaleSuccessDTO> successGroupedBySeller(){
    return repository.successGroupedBySeller();
}
}
