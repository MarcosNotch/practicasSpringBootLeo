package com.example.demo.empleado;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer id_empleado;

    private String nombre;

    private String apellido;

    private String dni;

    public Empleado(Integer id_empleado, String nombre, String apellido, String dni){
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Empleado() {
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
