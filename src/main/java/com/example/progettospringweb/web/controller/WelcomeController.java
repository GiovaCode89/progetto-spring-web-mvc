package com.example.progettospringweb.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//I controller sono considerati come dei bean
@Controller
public class WelcomeController {



    // l'ann. "@ResponseBody" di che il metodo deve restituire un testo
    // Di default i metodi rispondono a chiamate di tipo GET
    @RequestMapping("/")
    @ResponseBody
    public String welcome (){
        return "benvenuto nel sito";
    }

    @RequestMapping(
            path="/bye",
            method= RequestMethod.GET)
    @ResponseBody
    public String secondoWelcome (){
        return "Salve a tutti";
    }

    //metodo esempio
    //Specifico che il metodo risponde a chiamate di tipo GET
    @RequestMapping(
            path= "/helloworld",
            method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "Hello_world";
    }



    //Secondo metodo esempio
    //Questo metodo restituisce la view 'firstPage' tra le risorse presenti nell'applicazione
    @RequestMapping("/firstPage")
    public String getFirstPage(){
        return "first_page";
    }
}
