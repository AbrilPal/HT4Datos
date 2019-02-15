/*
 * To change this license header, choose
License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *  Clase AbstractPila
 *  clase abstracta de pilas, encargada de verificar el funcionamiento basico de una pila.
 *
 * @author Marco Fuentes y Abril Palencia
 * @since 15/02/2019
 *
 */

public abstract class AbstractPila <E> implements Stack<E> {
    /**
     * AbstractPila
     * no defiido.
     */
    public AbstractPila(){}

    /**
     * isEmpty
     * verifica si esta vacio.
     * @return
     */
    public boolean isEmpty(){
        return empty();
    }
}
