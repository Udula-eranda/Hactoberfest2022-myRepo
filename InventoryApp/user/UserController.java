package com.example.InventoryApp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepositary roleRepo;

    @GetMapping("/users")
    public String showUserList(Model model){
        List<User> listUsers=userRepo.findAll();
        model.addAttribute("listUsers",listUsers);
        return "users";
    }

    @GetMapping("/users/new")
    public String showCreateNewUserForm(Model model){
        List<Role> listRoles =roleRepo.findAll();
        model.addAttribute("listRoles",listRoles);
        model.addAttribute("user",new User());
        return "user_form";
    }

    @PostMapping("/users/save")
    public String saveUser(User user){
        userRepo.save(user);
        return "redirect:/users";
    }
}
