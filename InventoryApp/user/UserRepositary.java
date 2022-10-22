package com.example.InventoryApp.user;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<User, Integer> {
}
