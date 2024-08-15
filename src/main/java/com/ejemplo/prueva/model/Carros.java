package com.ejemplo.prueva.model;

import jakarta.persistence.*;

@Entity
@Table(name = "carros")
public class Carros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String color;

    public Carros(){}

    public Carros(String nombre,
                  String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Carros(Long id,
                  String nombre,
                  String color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id + '\n' +
                ", nombre='" + nombre + '\n' +
                ", color='" + color + '\n' +
                '}';
    }
}
