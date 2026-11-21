package com.example.lab10_20241884.beans;

public class Sede {

    private int idSede;
    private String nombre;
    private String ciudad;



    public Sede(){}

    public Sede(int idSede, String nombre, String ciudad) {
        this.idSede = idSede;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
