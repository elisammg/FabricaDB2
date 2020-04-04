package com.proyecto.fabrica.controller;


import com.proyecto.fabrica.interfaceService.ICarrosService;
import com.proyecto.fabrica.modelo.Carros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class ControllerCarros {

    @Autowired
    private ICarrosService service;

    @GetMapping("/carros")
    public String listar(Model model)
    {
        List<Carros> carros=service.listar();
        model.addAttribute("carros", carros);
        return "carros";
    }

    @GetMapping("/carronuevo")
    public String agregarcarro(Model modelo){
        modelo.addAttribute("carros", new Carros());
        return "carronuevo";
    }

    @PostMapping("/savecarro")
    public String save(@Valid Carros ca, Model model){
        service.save(ca);
        return "redirect:/carros";
    }
}
