/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.institutotm.pruebamod5.models;

/**
 *
 * @author Manuel
 */
public class Motor {
    private String modelo;
    private String fabricante;
    private double potencia;
    private double peso;
    private int cantidad;

    public Motor() {
    }

    public Motor(String modelo, String fabricante, double potencia, double peso, int cantidad) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
