package com.example.InventoryApp.shoppingcart;

import com.example.InventoryApp.product.ProductRepository;
import com.example.InventoryApp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartItemController {
    @Autowired
    private CartItemRepository cartRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/cart")
    public String listBrands(Model model){
        List<CartItem> listItems = cartRepo.findAll();
        model.addAttribute("listItems" , listItems);

        return "cartItems";
    }
}
