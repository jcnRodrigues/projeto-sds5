package com.dvsuperior.dsvends.Service;

import com.dvsuperior.dsvends.dto.SellerDTO;
import com.dvsuperior.dsvends.entities.Seller;
import com.dvsuperior.dsvends.repositories.SellerReposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class SellerService {

@Autowired
private SellerReposity repository;

public List<SellerDTO> findAll(){
    List<Seller> result = repository.findAll();
    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
}



}
