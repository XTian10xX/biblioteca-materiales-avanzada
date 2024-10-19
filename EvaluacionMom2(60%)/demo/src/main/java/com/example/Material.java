package com.example;

public abstract class Material {
    String titulo;
    String autor;
    int añoPublicacion;
    boolean disponible;

    public Material(String título, String autor, int añoPublicacion) {
        this.titulo = título;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarInformacion () {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Disponiblidad: " + disponible);
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El Material esta actualmente prestado.");
        } else {
            System.out.println("El Material no es disponible para prestar.");
        }
    }

    public void devolver() {
        if (disponible) {
            disponible = true;
            System.out.println("El Material ha sido devuelto.");
        }
    }

    public abstract String getTipoMaterial();

    public abstract double calcularTarifaPrestamo(int diasPrestamo);

}
