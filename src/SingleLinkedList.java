

/**
 *
 * @author fuent
 * @param <E>
 */
public class SingleLinkedList <E> extends AbstractList <E> {
    /**
     * Lleva el control del tamaño de la lista
     */
    protected int count;

    /**
     * El primer elemento de la lista
     */
    protected Nodo <E> head;
    protected Nodo <E> tail;

    /**
     * Constructor
     */
    public SingleLinkedList(){
        head = null;
        tail = null;
        count =0;
    }
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Nodo<E>(value, head);
        count++;
    }

    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Nodo<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Nodo<E> temp = new Nodo<E>(value,null);
        if (head != null)
        {
            // pointer to possible tail
            Nodo<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;

        count++;
    }


    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Nodo<E> finger = head;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        if(head != null){
            Nodo finger = head;
            while(finger.next() != null){
                finger = finger.next();
            }
            return (E) finger.value();
        }
        return head.value();
    }


    @Override
    public E removeLast() {
        Nodo<E> finger = head;
        Nodo<E> previous = null;
        while (finger.next() != null){
            previous = finger;
            finger =finger.next();
        }
        if (previous == null){
            head = null;
        }else{
            previous.setNext(null);
        }
        count--;
        return finger.value();
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