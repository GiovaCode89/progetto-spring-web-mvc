package com.example.progettospringweb.web.controller;


import org.apache.commons.logging.impl.SimpleLog;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/esempio")
public class EsempioController {


    //Questo servizio è invocato alla url ..../first?nome=Giovanni&cognome=Granatello&eta=33
    //Restituisce una stringa in formato json (produces)
    //headers permette di specificare dei parametri nell'header della request
    @RequestMapping(
            path = {"/first"},
            method = {RequestMethod.GET},
            params = {"nome=giovanni", "cognome=granatello", "eta!=32"},
            headers = {"Accept=application/json"},
            produces = {MediaType.APPLICATION_JSON_VALUE}
            //consumes={MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public String getValore() {
        return "{messaggio:\"hello_world\"}";
    }


    //L'oggetto HttpServletRequest contiene degli attributi all'interno
    //I valori della query string appartengono alla HttpServletRequest
    //ES: ....saluto1?modello=punto
    @ResponseBody
    @RequestMapping("/saluto1")
    public String firstSaluto(HttpServletRequest request) {
        String nome = request.getParameter("name");
        if (nome != null) {
            return "ciao " + nome;
        }
        return "ciao a tutti";
    }


    //todo vedere cos'è una sessione
    @ResponseBody
    @RequestMapping("/saluto2")
    public String secondoSaluto(HttpSession session) {
        Object obj = session.getAttribute("name");
        if (obj != null) {
            return "ciao " + obj.toString();
        }

        session.setAttribute("name", "Giovanni Granatello");
        return "ciao non ti conosco";
    }


    //@RequestParam permette di prelevare i valori della query string
    @ResponseBody
    @RequestMapping("/saluto3")
    public String terzoSaluto(@RequestParam("value") String valore) {
        return "Il valore inserito è " + valore;
    }


    //@RequestHeader permette di recuperare un'attributo dalla request header della request
    @ResponseBody
    @RequestMapping("/saluto4")
    public String quartoSaluto(@RequestHeader("User-Agent") String userAgent) {
        return "User-Agent = " + userAgent;
    }


    //@CookieValue permette di prelevare un attributo del cookie
    //i valori del cookie sono contenuti nella request header
    @ResponseBody
    @RequestMapping("/saluto5")
    public String quintoSaluto(@CookieValue("JSESSIONID") String jSessionId) {
        return "JSESSIONID = " + jSessionId;
    }


    @GetMapping("/saluto6")
    public String sestoSaluto(HttpServletRequest request) {
        request.setAttribute("valore", 125);
        return "forward:/esempio/2";
    }


    //@RequestAttribute permette di passare come parametro un attributo presente nella request
    //Questo metodo è legato a sestoSaluto
    @ResponseBody
    @GetMapping("/2")
    public String sestoSaluto2(@RequestAttribute("valore") String valore) {
        return "il valore settato nella request è " + valore;
    }


    @GetMapping("/saluto7")
    public String settimoSaluto(HttpServletRequest request) {
        if (request.getSession().getAttribute("messaggio")==null || request.getSession().getAttribute("messaggio").toString().trim().equals("")) {
            request.getSession().setAttribute("messaggio","session OK");
        }
        return "forward:/esempio/3";
    }


    //@SessionAttribute permette di prelevare un attributo dalla sessione e passarlo come parametro
    //Questo metodo è legato a settimoSaluto
    @GetMapping("/3")
    @ResponseBody
    public String secondSettimoSaluto (@SessionAttribute("messaggio") String msg){
        return " - messaggio = " +msg;
    }



    //reditect : fà partire un altro metodo del controller
    @GetMapping("/redirect")
    @ResponseBody
    public String redirect (){
        return "redirect:/saluto3 ";
    }



    //forward : come redirect, ma c'è una differenza
    @GetMapping("/forward")
    @ResponseBody
    public String forward (){
        return "forward:/saluto3 ";
    }


    @GetMapping("/test")
    public String getTestPage(){
        return "test";
    }


//Annotation che specificano direttamente la chiamata http utile per invocare il metodo (con tanto di parte di url)
//Queste annotation possono essere applicate solo sui metodi
    /*
    @GetMapping("/firstMethod")
    @PostMapping()
    @DeleteMapping()
    @PatchMapping()
    @PutMapping()
    */


}
