/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Thiarlles
 */
@RestController
public class RestSpringController {
    
    private Teste teste;

    public RestSpringController(Teste teste) {
        this.teste = teste;
    }    
    
    @RequestMapping(value = "/getDetails")
    public String getDetails() {
     return "details";
    }
    
    @RequestMapping(value = "/findAlunos")
    public List<Alunos>getAllAlunos() {
    
        List<Alunos>alunos = this.teste.findAll();
        return alunos;
    }
}
