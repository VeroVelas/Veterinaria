package com.upchiapas.practica03;

import com.upchiapas.practica03.models.ListaPersona;
import com.upchiapas.practica03.models.Persona;
import com.upchiapas.practica03.models.Vehiculo;
import com.upchiapas.practica03.utils.ClearScreen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static ListaPersona personas = new ListaPersona();
    private static Scanner teclado = new Scanner(System.in);
    private static ClearScreen process =  new ClearScreen();
    public static void main(String[] args) {
        byte opcion;

        //Menú de la aplicación
        do {
            process.ClearConsole();
            System.out.println("UNIVERSIDAD POLITÉCNICA DE CHIAPAS");
            System.out.println("ACCESO VEHICULAR");
            System.out.println("1. Agregar personas");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Mostrar personas con vehículos");
            System.out.println("4. Agregar vehículos");
            System.out.println("5. Buscar personas");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción:");
            opcion = teclado.nextByte();
            teclado.nextLine();
            process.ClearConsole();
            switch (opcion) {
                case 1:
                    addPersona();
                    break;
                case 2:
                    personas.imprimirPersonas();
                    break;
                case 3:
                    personas.imprimirPersonaWithVehiculo();
                    break;
                case 4:
                    addVehiculo();
                    break;
                case 5:
                    searchPersona();
                    break;
            }
            System.out.print("Presione una tecla para continuar...");
            teclado.nextLine();
        }while (opcion <6);

    }

    public static void addPersona(){
        process.ClearConsole();
        System.out.print("Nombre: ");
        if (personas.addPersona(new Persona(teclado.nextLine())))
            System.out.println("Registro almacenado exitosamente");
        else
            System.out.println("¡Warning! El registro no se registró exitosamente");

    }
    public static void addVehiculo(){
        byte numero;
        String marca;
        short modelo;
        System.out.println("Lista de personas registradas");
        personas.imprimirPersonas();
        System.out.println("Selecciona el número de la persona, para agregar vehiculo");
        System.out.print("Número:");
        numero = teclado.nextByte();
        teclado.nextLine();
        System.out.println("Datos del vehiculo");
        System.out.print("Marca:");
        marca = teclado.nextLine();
        System.out.print("Modelo:");
        modelo = teclado.nextShort();
        if (personas.get(--numero).addVehiculo(new Vehiculo(marca,modelo)))
            System.out.println("Registro almacenado exitosamente");
        else
            System.out.println("¡Warning! El registro no se registró exitosamente");
        teclado.nextLine();
    }

    public static void searchPersona(){
        String nombre;
        Persona persona;
        System.out.println("Módulo para buscar persona");
        System.out.print("Indica el nombre a buscar:");
        nombre = teclado.nextLine();
        persona = personas.searchPersona(nombre);
        if (persona != null)
            System.out.println(persona);
        else System.out.println("No existe la persona buscada");
    }

}
