package br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
    @GetMapping("/")
    public String index(){
        return "Novo Livro";
    }
}
