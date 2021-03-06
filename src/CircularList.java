/**
 *Clase CircularList
 * encargada de operar listas circulares. tipo de listas, no todos los metodos estan definidos porque no se utilizaron.
 * @author fuent
 */
public class CircularList <E> extends AbstractList <E>
{
    protected Nodo<E> tail;
    protected int count;

    /**
     * Constructor CircularList
     * asina los valores iniciales de tail y el contador.
     */
    public CircularList()
// pre: constructs a new circular list
    {
        tail = null;
        count = 0;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo addFirst
     * encargado de colocar un nuevo elemento al comienzo de la lista.
     * @param value
     */
    public void addFirst(E value) {
        Nodo<E> temp = new Nodo<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }

    /**
     * Metodo addLast.
     * encargado de recorrer la lista y depositar elnnuevo valor al final
     * @param value
     */
    public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
    {
        // new entry:
        addFirst(value);
        tail = tail.next();
    }


// lo dificil es quitar el elemento de la cola

    /**
     * Metodo removeLast.
     * eliminar o sacar el ultimo elemento de la lista.
     * @return
     */
    public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
    {
        Nodo<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Nodo<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /**
     * Metodo getLast
     * encuentra el ultimo elemento de la lista.
     */
    public E getLast() {
        if(tail != null) {
            Nodo<E> finger = tail;
            while (finger.next() != tail) {
                finger = finger.next();
            }
            return finger.value();
        }
        return tail.value();
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
