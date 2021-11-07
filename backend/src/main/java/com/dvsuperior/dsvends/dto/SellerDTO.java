package com.dvsuperior.dsvends.dto;

import java.io.Serializable;

import com.dvsuperior.dsvends.entities.Seller;

public class SellerDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;

    public SellerDTO(){
    }
    
    public SellerDTO(long id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public SellerDTO(Seller entity) {
        this.setId(entity.getId());
        this.setName(entity.getName());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
