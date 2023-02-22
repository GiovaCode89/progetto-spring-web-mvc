package com.example.progettospringweb.web.controller;



import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/esempio")
public class EsempioController {


    //Questo servizio è invocato alla url ..../first?nome=Giovanni&cognome=Granatello&eta=33
    //Restituisce una stringa in formato json (produces)
    //headers permette di specificare dei parametri nell'header della request
    @RequestMapping(
            path={"/first"},
            method= {RequestMethod.GET},
            params={"nome=giovanni","cognome=granatello","eta!=32"},
            headers = {"Accept=application/json"},
            produces = {MediaType.APPLICATION_JSON_VALUE}
            //consumes={MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public String getValore(){
        return "{messaggio:\"hello_world\"}";
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
