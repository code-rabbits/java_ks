package com.zut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String log(HttpSession session, String username, String password, Model model){
        if (username.equals("admin")&&password.equals("123")){

            return "redirect:/index.html";
        }else {
            model.addAttribute("msg","用户名或密码错误，请重新输入");
            return "login";
        }
    }

}
