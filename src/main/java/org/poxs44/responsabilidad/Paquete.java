package org.poxs44.responsabilidad;

public class Paquete {
    private String contenido;
    private String destino;
    private double peso;
    public Paquete(String contenido, String destino, double peso) {
        this.contenido = contenido;
        this.destino = destino;
        this.peso = peso;
    }
    ///// COMPLETAR ////
    public String toString() {
        return "### Paquete # Contenido: " + contenido + " # Destino: " + destino + " #
        Peso: " + peso;
    }
}