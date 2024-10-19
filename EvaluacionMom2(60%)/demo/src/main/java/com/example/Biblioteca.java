package com.example;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Material> materiales;

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material agregado");
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.titulo.equals(titulo)) {
                return material;
            }
        }
        return null;
    }

    public void mostrarCatalogo() {
        for (Material material : materiales) {
            material.mostrarInformacion();
            System.out.println();
        }
    }
}
