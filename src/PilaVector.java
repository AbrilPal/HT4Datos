import java.util.Vector;

/**
 *
 * @author Marco Fuentes
 *
 */

public class PilaVector<E> extends AbstractPila<E> {

    protected Vector vector = new Vector();

    @Override
    public void push(E item) {
        vector.add(item);
    }

    @Override
    public E pop() {
        E ultimoElemento = (E) vector.lastElement();
        vector.remove(vector.size() - 1);
        return ultimoElemento;
    }

    @Override
    public E peek() {
        return (E) vector.lastElement();
    }

    //Devuelve true si esta vacio, y false de lo contrario
    @Override
    public boolean empty() {
        return (vector.size() == 0);
    }

    @Override
    public int size() {
        return vector.size();
    }

}
