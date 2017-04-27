package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Alumno> claseProgramacion = new ArrayList<>();

        claseProgramacion.add(new Alumno("12345678A", "Francisco", "Delgado", "Gominola S", "fran@ymail.com"));
        claseProgramacion.add(new Alumno("11223344B", "Amalia", "delgado", "Avion 4", "amalia@gmail.com"));
        claseProgramacion.add(new Alumno("11122233C", "Luis", "Wonk", "España 23", "soyluis@hotmail.com"));
        claseProgramacion.add(new Alumno("87654321D", "Carlitos", "Alvarez", "Real S/N", "ca@hotmail.com"));
        claseProgramacion.add(new Alumno("12344321E", "Manuela", "Blanco", "Avda. de la 0", "mb@mail.com"));

        Collections.sort( claseProgramacion, Alumno.comparatorPorApellidoNombre );

        for (Alumno estuadiante : claseProgramacion
                ) {
            System.out.println(estuadiante);

        }

       // Alumno fran = new Alumno("12345678A", "Francisco", "Delgado", "Gominola S", "fran@ymail.com");
       // Alumno loBusco = new Alumno("12345678A");

       // if (fran.equals(loBusco)) {
       //     System.out.println("El alumno ya está matriculado.");
       // } else {
       //     System.out.println("El alumno NO está matriculado.");
       // }
    }
}
