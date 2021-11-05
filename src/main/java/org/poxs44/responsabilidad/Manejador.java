package org.poxs44.responsabilidad;


public abstract class Manejador {
    private Manejador sucesor;
    public void setSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }
    public Manejador getSucesor() {
        return sucesor;
    }
    public abstract void calculaCosteEnvio(Paquete p);
}

