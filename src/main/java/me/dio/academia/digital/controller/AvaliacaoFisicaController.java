package me.dio.academia.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }
}
