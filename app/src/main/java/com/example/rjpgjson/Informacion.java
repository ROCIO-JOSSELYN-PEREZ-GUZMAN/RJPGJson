package com.example.rjpgjson;

public class Informacion {
    String Nombre;
    int Edad;
    String Correo;
    String CURP;

    public Informacion(String nombre, int edad, String correo, String CURP) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
        this.CURP = CURP;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCURP() {
        return CURP;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
}


