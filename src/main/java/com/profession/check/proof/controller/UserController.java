package com.profession.check.proof.controller;

import com.profession.check.proof.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/index")
    public String index(Model model) {
        User user = new User();
        user.setAge(26);
        user.setEmail("747731461@qq.com");
        user.setName("村雨遥");
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/chart")
    public String chart(Model model) {
        return "chart";
    }
}