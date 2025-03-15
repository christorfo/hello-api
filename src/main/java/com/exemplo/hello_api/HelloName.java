package com.exemplo.hello_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloName {

    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem-vindo, " + nome + "!";
    }
}
