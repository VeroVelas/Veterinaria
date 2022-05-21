package com.upchiapas.practica03.models;

import java.util.Arrays;

public class Persona {
    private String nombre;
    private Vehiculo[] listaVehiculos = new Vehiculo[5];


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean addVehiculo(Vehiculo vehiculo){
        byte indice = 0;
        boolean status = false;
        while (indice < listaVehiculos.length &&
        listaVehiculos[indice] != null)
            indice++;
        if (indice < listaVehiculos.length) {
            listaVehiculos[indice] = vehiculo;
            status = true;
        }

        return status;
    }

    public Vehiculo[] getVehiculos(){
        return listaVehiculos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", listaVehiculos=" + Arrays.toString(listaVehiculos) +
                '}';
    }
}
