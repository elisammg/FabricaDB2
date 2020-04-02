package com.proyecto.fabrica.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;

@Document(collection = "clientes")
public class Clientes {
    @Id
    private String id;

    private String nombre;
    private String direccion;
    private String telefono;

    public Clientes () {

        }
        public Clientes(String nombre, String direccion, String telefono)
        {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString()
    {
        return "cliente [id = "+ id +", nombre="+ nombre +", direccion="+ direccion +", telefono="+ telefono +"]";
    }
}

