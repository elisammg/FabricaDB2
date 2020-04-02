package com.proyecto.fabrica.service;

import com.proyecto.fabrica.interfaceService.IClienteService;
import com.proyecto.fabrica.interfaces.ICliente;
import com.proyecto.fabrica.modelo.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ICliente data;
    @Override
    public List<Clientes> listar() {
        return (List<Clientes>) data.findAll();
    }

    @Override
    public Optional<Clientes> listarId(String id) {
        return Optional.empty();
    }

    @Override
    public int save(Clientes c) {
        return 0;
    }

    @Override
    public void delete(String id) {

    }
}
