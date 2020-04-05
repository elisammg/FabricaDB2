package com.proyecto.fabrica.controller;



import com.proyecto.fabrica.interfaceService.IPedidosService;
import com.proyecto.fabrica.modelo.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControllerPedidos {

    @Autowired
    private IPedidosService service;

    @GetMapping("/pedidos")
    public String listar(Model model)
    {
        List<Pedidos> pedidos=service.listar();
        model.addAttribute("pedidos", pedidos);
        return "pedidos";
    }

    @GetMapping("/pedidodetalle/{id}")
    public String listardetalle(@PathVariable String id, Model modelo)
    {
        Optional<Pedidos> pedidos=service.listarId(id);
        modelo.addAttribute("pedidos", pedidos);
        return "pedidodetalle";
    }

    @GetMapping("/pedidonuevo")
    public String agregar(Model modelo){
        modelo.addAttribute("pedidos", new Pedidos());
        return "pedidonuevo";
    }

    @PostMapping("/savepedido")
    public String save(@Valid Pedidos pe, Model model){
        service.save(pe);
        return "redirect:/pedidos";

    }

    @GetMapping("/editarpedido/{id}")
    public String editar(@PathVariable String id, Model modelo)
    {
        Optional<Pedidos> pedidos=service.listarId(id);
        modelo.addAttribute("pedidos", pedidos);
        return "pedidonuevo";
    }

    @GetMapping("/eliminarpedido/{id}")
    public String delete(Model modelo, @PathVariable String id)
    {
        service.delete(id);
        return "redirect:/pedidos";
    }

}
