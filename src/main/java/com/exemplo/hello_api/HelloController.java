package com.exemplo.hello_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem-vindo, " + nome + "!";
    }

    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 + num2;
        return "O resultado da soma de " + num1 + " + " + num2 + " é " + resultado;
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}