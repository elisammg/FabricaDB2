package com.proyecto.fabrica.modelo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="carros")
public class Carros {
    @Id
    private String id;

    private int codigo_universal;
    private String marca;
    private String linea;
    private int modelo;

    public Carros()
    {

    }

    public Carros(int codigo_universal, String marca, String linea, int modelo)
    {
        this.codigo_universal = codigo_universal;
        this.marca = marca;
        this.linea = linea;
        this.modelo=modelo;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getCodigo_universal() {
        return codigo_universal;
    }

    public void setCodigo_universal(int codigo_universal) {
        this.codigo_universal = codigo_universal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString()
    {
        return "carro [id = "+ id +", codigo_universal="+ codigo_universal +", marca="+ marca +", linea="+ linea +", modelo="+ modelo +"]";
    }
}
