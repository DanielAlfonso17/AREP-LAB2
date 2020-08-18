package edu.escuelaing.arep.sparkweb;


import edu.escuelaing.arep.sparkweb.LinkedList;
import edu.escuelaing.arep.sparkweb.Mean;
import edu.escuelaing.arep.sparkweb.Nodo;
import edu.escuelaing.arep.sparkweb.Operations;
import edu.escuelaing.arep.sparkweb.StandardDeviation;
import java.io.IOException;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void deberiaCalcularMediaCorrecta() throws IOException {
        LinkedList lista = new LinkedList();
        int[] arrayDatos = {0,160,591,114,229,230,270,128,1657,624,1503}; 
        for(int i = 0; i < arrayDatos.length; i++){
            Nodo nodo = new Nodo(arrayDatos[i]);
            lista.add(nodo);
        }
        Operations media = new Mean();
        double resultadoMedia = media.calculate(lista);
        assertTrue(resultadoMedia == 550.6);
    }
    
    @Test
    public void deberiaCalcularDesviacionCorrecta() throws IOException {
        LinkedList lista = new LinkedList();
        int[] arrayDatos = {0,160,591,114,229,230,270,128,1657,624,1503}; 
        for(int i = 0; i < arrayDatos.length; i++){
            Nodo nodo = new Nodo(arrayDatos[i]);
            lista.add(nodo);
        }
        Operations media = new Mean();
        double resultadoMedia = media.calculate(lista);
        Operations desviacionEstandar = new StandardDeviation(resultadoMedia);
        double resultadoDesviacion = desviacionEstandar.calculate(lista);
        assertTrue(resultadoDesviacion == 572.026844746915);
    }
    
    @Test
    public void deberiaCalcularMediaCorrecta2() throws IOException {
        LinkedList lista = new LinkedList();
        double[] arrayDatos = {0,15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2}; 
        for(int i = 0; i < arrayDatos.length; i++){
            Nodo nodo = new Nodo(arrayDatos[i]);
            lista.add(nodo);
        }
        Operations media = new Mean();
        double resultadoMedia = media.calculate(lista);
        assertTrue(resultadoMedia == 60.32000000000001);
    }
    
    @Test
    public void deberiaCalcularDesviacionCorrecta2() throws IOException {
        LinkedList lista = new LinkedList();
        double[] arrayDatos = {0,15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
        for (int i = 0; i < arrayDatos.length; i++) {
            Nodo nodo = new Nodo(arrayDatos[i]);
            lista.add(nodo);
        }
        Operations media = new Mean();
        double resultadoMedia = media.calculate(lista);
        Operations desviacionEstandar = new StandardDeviation(resultadoMedia);
        double resultadoDesviacion = desviacionEstandar.calculate(lista);
        assertTrue(resultadoDesviacion == 62.25583060601187);
    }
}
