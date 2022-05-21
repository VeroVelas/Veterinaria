package com.upchiapas.practica03.models;

public class Vehiculo {
    private String marca;
    private short modelo;

    public Vehiculo(String marca, short modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public short getModelo() {
        return modelo;
    }

    public void setModelo(short modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
