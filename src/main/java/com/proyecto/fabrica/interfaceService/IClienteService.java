package com.proyecto.fabrica.interfaceService;

import com.proyecto.fabrica.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public List<Cliente>listar();
    public Optional<Cliente>listarId(String id);
    public int save(Cliente c);
    public void delete(String id);
}
