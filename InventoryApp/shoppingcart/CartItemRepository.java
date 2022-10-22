package com.example.InventoryApp.shoppingcart;

import com.example.InventoryApp.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
}
