package com.example.progettospringweb.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@EnableWebMvc = abilita l'applicazione all'MVC e gli si danno i bean principali per fare l'MVC
//@ComponentScan = in questo caso, si occupa di recuperare i controller

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example.progettospringweb.web.controller")
public class Config {


    //Definisco il ViewResolver
    //è fondamentale per aprire pagine web direttamente dai metodi del controller
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }


}
