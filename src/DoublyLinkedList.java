/**
 *
 * @author fuent
 */
public class DoublyLinkedList <E> extends AbstractList <E>
{
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    /**
     * Constructor
     * define el valor de los atributos y variables.
     */
    public DoublyLinkedList() // post: constructs an empty list
    {
        head = null;
        tail = null;
        count = 0;
    }
    /**
     * Metodo addFirst
     * encargado de colocar un nuevo elemento al comienzo de la lista.
     * @param value
     */
    public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
    {
        // construct a new element, making it head
        head = new DoublyLinkedNode<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

    /**
     * Metodo addLast.
     * encargado de recorrer la lista y depositar elnnuevo valor al final
     * @param value
     */
    public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
    {
        // construct new element
        tail = new DoublyLinkedNode<E>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }

    /**
     * Metodo addFirst
     * encargado de colocar un nuevo elemento al comienzo de la lista.
     */
    public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
    {
        DoublyLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        return (E) tail.value();
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
