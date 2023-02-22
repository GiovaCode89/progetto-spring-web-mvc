package com.example.progettospringweb.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//L'annotation '@RestController' indica che il controller fà da servizio Rest.
// Quest'ann. include la funzionalità dell'ann. "@ResponseBody'
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @GetMapping("/stampaNome")
    @ResponseBody
    public String helloWorld(){
        return "Sono Giovanni";
    }

}
