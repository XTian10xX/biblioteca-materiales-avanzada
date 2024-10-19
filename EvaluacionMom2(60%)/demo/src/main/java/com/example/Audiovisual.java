package com.example;

public class Audiovisual extends Material{
    String formato;
    int duracion;

    private static final double TARIFA_BASE = 1.0;
    private static final double RECARGO_ADICIONAL = 1.2;

    public Audiovisual(String título, String autor, int añoPublicacion) {
        super(título, autor, añoPublicacion);
    }

    @Override
    public String getTipoMaterial() {
       return "Audiovisual";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifa = TARIFA_BASE * diasPrestamo;
        if (formato == "Blu-Ray") {
            tarifa += RECARGO_ADICIONAL * diasPrestamo;
        }
        return tarifa;
    }

    public void mostrarDetallesAudiovisual() {
        mostrarInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion);
    }
}
