package com.example.InventoryApp.category;

import com.example.InventoryApp.brand.Brand;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Integer id;

    @Column(length = 45 , nullable = false , unique = true)
    private  String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public Category() {
    }

    public Category(Integer id) {
        this.id = id;
    }

    public Category( String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return  name;
    }
}
