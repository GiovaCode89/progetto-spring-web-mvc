package com.example.progettospringweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {


    //dò più indirizzi al metodo
    //Il metodio può essere invocato con una chiamata GET o con una chiamata POST
    @RequestMapping(
            path={"/execute","/solve"},
            method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String login (){
        //logica del login
        return null;
    }



}
