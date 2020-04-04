package com.proyecto.fabrica.modelo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Productos {

    @Id
    private String id;

    private String nombre;
    private String descripcion;
    private String carros;
    private int cantidad;
    private int precio;

    public Productos () {

    }
    public Productos(String nombre, String descripcion, String carros, int cantidad, int precio)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.carros = carros;
        this.cantidad = cantidad;
        this.precio = precio;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCarros() {
        return carros;
    }

    public void setCarros(String carros) {
        this.carros = carros;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
