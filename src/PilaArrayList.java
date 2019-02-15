import java.util.ArrayList;


/**
 *
 * @author Marco Fuentes
 * @param <E>
 *
 */

public class PilaArrayList<E> extends AbstractPila<E> {

    protected ArrayList<E> lista = new ArrayList<E>();

    @Override
    public void push(E item) {
        lista.add(item);
    }

    @Override
    public E pop() {
        E ultimoElemento = (E) lista.get(lista.size()-1);
        lista.remove(lista.size() -1 );
        return ultimoElemento;

    }

    @Override
    public E peek() {
        return (E) lista.get(lista.size() -1 );
    }

    @Override
    public boolean empty() {
        return (lista.isEmpty());
    }

    @Override
    public int size() {
        return lista.size();
    }

}