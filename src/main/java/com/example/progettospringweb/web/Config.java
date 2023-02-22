package com.example.progettospringweb.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableWebMvc = abilita l'applicazione all'MVC e gli si danno i bean principali per fare l'MVC
//@ComponentScan = in questo caso, si occupa di recuperare i controller

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example.progettospringweb.web.controller")
public class Config {

}
