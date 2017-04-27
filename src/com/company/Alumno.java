package com.company;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Manu on 26/04/2017.
 */
public class Alumno implements Comparable {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String dni;

    //Constructor por defecto

    public Alumno() {
    }

    public Alumno(String dni) {
        this.dni = dni;
    }

    //Constructor

    public Alumno(String dni,
                  String nombre,
                  String apellidos,
                  String direccion,
                  String email)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.dni = dni;
    }


    //Accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //Metodos

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //self check
        if (this == obj){
            return true;
        }
        //null check
        if (obj == null){
            return false;
        }
        //type check and cast
        if (this.getClass() != obj.getClass()){
            return false;
        }

        //field comparison
        Alumno alu = (Alumno) obj;

        return Objects.equals(this.dni, alu.dni);

    }

    @Override
    public int compareTo(Object obj) {
        Alumno alumno = (Alumno) obj;

        int resultado;

        resultado = this.getApellidos().compareToIgnoreCase( alumno.getApellidos() );

//        if (resultado != 0){
//            return resultado;
//        }

        return this.getNombre().length() - alumno.getNombre().length();
    }

    public static Comparator<Alumno> comparatorPorApellidoNombre = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno alumno1, Alumno alumno2) {

            int resultado;

            resultado = alumno1.getApellidos().compareToIgnoreCase( alumno2.getApellidos());

        if (resultado != 0){
            return resultado;
        }

            return alumno1.getNombre().compareToIgnoreCase( alumno2.getNombre());
        }
    };

    public static Comparator<Alumno> comparadorPorLongitudNombre = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno alu1, Alumno alu2) {


            return alu1.getNombre().length() - alu2.getNombre().length();
        }
    };
}
