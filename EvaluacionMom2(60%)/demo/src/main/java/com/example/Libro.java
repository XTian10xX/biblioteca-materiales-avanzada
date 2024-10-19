package com.example;

public class Libro extends Material {
    private String isbn;
    private int numeroDePaginas;

    private static final double TARIFA_BASE = 1.0;
    private static final double RECARGO_PAGINAS = 0.5;

    public Libro(String título, String autor, int añoPublicacion) {
        super(título, autor, añoPublicacion);
    }

    @Override
    public String getTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifa = TARIFA_BASE * diasPrestamo;
        if (numeroDePaginas > 500) {
            tarifa += RECARGO_PAGINAS * diasPrestamo;
        }
        return tarifa;
    }

    public void mostrarDetallesLibro(){
        mostrarInformacion();
        System.out.println("ISBN: " + isbn);
        System.out.println("Numero de Páginas: " + numeroDePaginas);
    }
}
