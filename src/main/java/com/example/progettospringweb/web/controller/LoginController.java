package com.example.progettospringweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {


    //dò più indirizzi al metodo
    @RequestMapping(path={"/execute","/solve"})
    @ResponseBody
    public String login (){
        //logica del login
        return null;
    }



}
