
package edu.escuelaing.arep.sparkweb;

/**
 *
 * @author Daniel Alfonso
 */
public class StandardDeviation implements Operations{
    private double media;
    private double resultado;

    public StandardDeviation(double media) {
        this.media = media;
    }

    public double calculate(LinkedList lista) {
        double suma= 0;
        for(Nodo nodo: lista){
            suma += Math.pow((nodo.getValor() - media),2);
        }
        resultado = (double) suma/(lista.getTamaño()-1);
        resultado = Math.sqrt(resultado);
        return resultado;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
