
/**
 *
 * @author fuent
 */
public class Nodo <E> {
    protected E data; //Valor que se almacena en este nodo
    protected Nodo<E> nextElement; //Referencia al siguiente nodo

    //Constructor

    /**
     * Constructor
     * @param v es el valor que sera almacenado en el nodo
     * @param next es la referencia al proximo valor en el siguiente nodo
     */
    public Nodo(E v, Nodo<E> next)
    {
        data = v;
        nextElement = next;
    }

    public Nodo(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null);
    }

    public Nodo<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }

    public void setNext(Nodo<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    public E value()
    // post: returns value associated with this element
    {
        return data;
    }

    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }
}
