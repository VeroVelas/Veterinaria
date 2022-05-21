package com.upchiapas.practica03.models;

public class ListaPersona {
    private static Persona[] listaPersona = new Persona[5];

    public boolean addPersona(Persona persona){
        byte indice = 0;
        boolean status = false;
        while (indice < listaPersona.length &&
                listaPersona[indice] != null)
            indice++;
        if (indice < listaPersona.length) {
            listaPersona[indice] = persona;
            status = true;
        }

        return status;
    }

    public void imprimirPersonas(){
        byte indice=0;
        while (indice < listaPersona.length &&
                listaPersona[indice] != null) {
            System.out.println(indice+1 + ". " + listaPersona[indice].getNombre());
            indice++;
        }
        if (indice == 0)
            System.out.println("No existen registros almacenados");


    }

    public void imprimirPersonaWithVehiculo(){
        byte indice=0;
        while (indice < listaPersona.length &&
                listaPersona[indice] != null) {
            System.out.println(listaPersona[indice]);
            indice++;
        }
        if (indice == 0)
            System.out.println("No existen registros almacenados");

    }

    public Persona get(byte indice){
        return listaPersona[indice];
    }

    public Persona searchPersona(String nombre){
        byte indice = 0;
        boolean status = false;
        while (indice < listaPersona.length &&
                listaPersona[indice] != null &&
                !status) {
            if (listaPersona[indice].getNombre().equalsIgnoreCase(nombre)) {
                status = true;
            }
            indice++;
        }
        if (status)
            return listaPersona[--indice];
         else
            return null;
    }
}
