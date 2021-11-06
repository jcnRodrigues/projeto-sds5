package com.dvsuperior.dsvends.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;


    public Sale(long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
        this.id = id;
        this.setVisited(visited);
        this.setDeals(deals);
        this.setAmount(amount);
        this.setDate(date);
        this.setSeller(seller);
    }



    public Seller getSeller() {
        return seller;
    }



    public void setSeller(Seller seller) {
        this.seller = seller;
    }



    public LocalDate getDate() {
        return date;
    }



    public void setDate(LocalDate date) {
        this.date = date;
    }



    public Double getAmount() {
        return amount;
    }



    public void setAmount(Double amount) {
        this.amount = amount;
    }



    public Integer getDeals() {
        return deals;
    }



    public void setDeals(Integer deals) {
        this.deals = deals;
    }



    public Integer getVisited() {
        return visited;
    }



    public void setVisited(Integer visited) {
        this.visited = visited;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    } 
}
