package com.example.kanner;

public class Resultados {
    private String clave;
    private String nombreC;
    private String comunicacion;
    private String expresivo;
    private String simbolico;
    private String fecha;

    public Resultados() {

    }
    public Resultados(String clave, String nombreC, String comunicacion, String expresivo, String simbolico, String fecha) {
        this.clave = clave;
        this.nombreC = nombreC;
        this.comunicacion = comunicacion;
        this.expresivo = expresivo;
        this.simbolico = simbolico;
        this.fecha = fecha;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(String comunicacion) {
        this.comunicacion = comunicacion;
    }

    public String getExpresivo() {
        return expresivo;
    }

    public void setExpresivo(String expresivo) {
        this.expresivo = expresivo;
    }

    public String getSimbolico() {
        return simbolico;
    }

    public void setSimbolico(String simbolico) {
        this.simbolico = simbolico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
