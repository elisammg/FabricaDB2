package com.proyecto.fabrica.service;

import com.proyecto.fabrica.interfaceService.IClienteService;
import com.proyecto.fabrica.interfaces.ICliente;
import com.proyecto.fabrica.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ICliente data;
    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) data.findAll();
    }

    @Override
    public Optional<Cliente> listarId(String id) {
        return Optional.empty();
    }

    @Override
    public int save(Cliente c) {
        return 0;
    }

    @Override
    public void delete(String id) {

    }
}
