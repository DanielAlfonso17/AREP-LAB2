
package edu.escuelaing.arep.sparkweb;

/**
 *
 * @author Daniel
 */
public class Nodo {
    double valor;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(double valor){
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
