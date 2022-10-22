package com.example.InventoryApp.user;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 225 , nullable = false , unique = true)
    private String name;
    public Role(){}
    public Role( String name) {
        super();
        this.name = name;
    }
    public Role(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Role(Integer id) {
        super();
        this.id = id;
            }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;
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
}
