package com.proyecto.fabrica.forTest;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Tiendas {

    @Id
    private String id;
    private String nombre;
    private int telefono;

    public Tiendas(String name, int telefono) {
        this.nombre = name;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiendas tiendas = (Tiendas) o;
        return telefono == tiendas.telefono &&
                Objects.equals(id, tiendas.id) &&
                Objects.equals(nombre, tiendas.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, telefono);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tiendas{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
}
