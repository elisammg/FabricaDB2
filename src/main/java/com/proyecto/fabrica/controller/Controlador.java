package com.proyecto.fabrica.controller;

import com.proyecto.fabrica.interfaceService.IClienteService;
import com.proyecto.fabrica.modelo.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IClienteService service;

    @GetMapping("/listar")
    public String listar(Model model)
    {
        List<Clientes>clientes=service.listar();
        model.addAttribute("clientes", clientes);
        return "index";
    }
}
