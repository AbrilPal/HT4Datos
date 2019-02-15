/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Clase AbstractList.
 * clase abstracta de listas, encargada de verificar el funcionamiento basico de una lista.
 *
 * @author Marco Fuente y Abril Palencia.
 * @since 15/02/2019
 * @param <E> tipo de dato generico que recibe la lista.
 */
public abstract class AbstractList <E> implements List<E>
{
    /**
     * metodo AbstractList
     * no hace nada, es el constructor.
     */
    public AbstractList ()
    // post: does nothing
    {
    }

    /**
     * Metodo isEmpty
     * veridica si la lista esta vacia.
     * @return 0 si no tiene elementos.
     */
    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
        return size() == 0;
    }

    /**
     * Metodo contains
     * retorna verdadero si la lista tiene un objeto que es igual al valor.
     *
     * @param value
     * @return
     */
    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    {
        return -1 != indexOf(value);
    }

}
