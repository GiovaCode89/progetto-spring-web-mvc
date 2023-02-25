package com.example.progettospringweb.web.controller;


import com.example.progettospringweb.web.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/create")
    public ModelAndView creaCliente (){
        return new ModelAndView("creaCliente","datiCliente", new Cliente());
    }

    @PostMapping("/justCreate")
    public ModelAndView justCreateClient (@ModelAttribute("datiCliente") Cliente cliente){

        if (cliente.getCognome().equals("Russo"))
            cliente.setCognome("Granatello");

        //primo parametro =pag. jsp; secondo parametro = model; terzo parametro = istanza che va a popolare il form
        return new ModelAndView("creaCliente","datiCliente",cliente);
    }
}
