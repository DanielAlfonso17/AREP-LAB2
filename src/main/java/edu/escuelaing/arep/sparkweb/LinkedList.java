
package edu.escuelaing.arep.sparkweb;

/**
 *
 * @author Daniel
 */


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
 * Author: Daniel Felipe ALfonso Bueno
 * */

public class LinkedList implements List<Nodo>{
    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    public LinkedList(){
        primero = null;
        ultimo = null;
        tamaño = -1;
    }
    
    /*
    * Elimina el ultimo valor de nuestra LinkedList cambiando a null el valor del ultimo nodo
    * */

    public double popValueRight() {
        try {
            double valorUltimo = this.ultimo.getValor();
            if (this.ultimo == this.primero){
                this.ultimo = this.primero = null;
            }else{
                Nodo penultimo = this.ultimo.getAnterior();
                penultimo.setSiguiente(null);
                this.ultimo = penultimo;
            }
            this.tamaño--;
            return valorUltimo;
        }catch (Exception e){
            throw new NullPointerException("No se puede eliminar elemento, Linked List vacia");
        }

    }
    /**
     * Imprimir la lista en consola
     */
    public void printLinkedList(){
        Nodo nodo = this.primero;
        while (nodo != null){
            System.out.println(nodo.getValor());
            nodo = nodo.getSiguiente();
        }
    }

    /*
    * LinkedList implementa iterator, este metodo permite la iteracion de nuestra LinkedList desde cualquier lugar como una coleccion cualquiera
    * con un simple for (Object o: lista)
    * */
    public Iterator<Nodo> iterator() {

        Iterator<Nodo> ite = new Iterator<Nodo>() {
            Nodo nodoActual = primero;
            public boolean hasNext() {
                if(nodoActual.getSiguiente() != null){
                    return true;
                }else{
                    return false;
                }

            }
            public Nodo next() {
                nodoActual = nodoActual.getSiguiente();
                return nodoActual;
            }

            public void remove() {
            }
        };

    return ite;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    * @Param double valor dato a añadir a la linkedList
    * Recibe un valor y agrega un nuevo nodo a la LinkedList con este valor
    */
    @Override
    public boolean add(Nodo e) {
        if(this.ultimo == null){
            this.primero = this.ultimo = e;
        }else{
            this.ultimo.siguiente = e;
            e.setAnterior(this.ultimo);
            this.ultimo = e;
        }
        this.tamaño++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nodo get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nodo set(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nodo remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<Nodo> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<Nodo> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Nodo> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
