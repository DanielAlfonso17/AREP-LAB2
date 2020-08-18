/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.sparkweb;

/**
 *
 * @author Daniel
 */
public class Mean implements Operations {
    private double resultado;

    public double calculate(LinkedList lista) {
        double suma = 0;
        for(Nodo i: lista){
            suma += i.getValor();
        }
        resultado = (double) suma/lista.getTamaño();
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
