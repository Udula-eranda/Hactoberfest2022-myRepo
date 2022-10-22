package com.example.InventoryApp.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserListController {

    @GetMapping("/userList")
    public String getInfo(){
        return "userList";
    }
}
