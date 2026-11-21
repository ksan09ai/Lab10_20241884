package com.example.lab10_20241884.beans;

public class Equipo {
    private int idEquipo;
    private String hostname;
    private String tipo;
    private String ipGestion;
    private String estado;
    private String fecha_alta;
    private Sede sede;


    public Equipo(){}

    public Equipo(int idEquipo, String hostname, String tipo, String ipGestion, String estado, String fecha_alta, Sede sede) {
        this.idEquipo = idEquipo;
        this.hostname = hostname;
        this.tipo = tipo;
        this.ipGestion = ipGestion;
        this.estado = estado;
        this.fecha_alta = fecha_alta;
        this.sede = sede;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
