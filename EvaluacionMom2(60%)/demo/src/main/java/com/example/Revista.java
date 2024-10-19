package com.example;

public class Revista extends Material{
    int numeroDeEdicion;
    String mesDePublicacion;

    private static final double TARIFA_BASE = 1.0;

    public Revista(String título, String autor, int añoPublicacion) {
        super(título, autor, añoPublicacion);
    }

    @Override
    public String getTipoMaterial() {
        return "Revista";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifa = TARIFA_BASE * diasPrestamo;
        return tarifa;
    }

    public void mostrarDetallesRevista() {
        mostrarInformacion();
        System.out.println("Núero de Edición: " + numeroDeEdicion);
        System.out.println("Mes de Publicación: " + mesDePublicacion);
    }
}
