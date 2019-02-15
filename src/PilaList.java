
/**
 *
 * @author Marco Fuentes
 * @param <E>
 *
 */

public class PilaList<E> extends AbstractPila<E> {

    private List lista;

    public PilaList(int a){
        FactoryList factory = new FactoryList();
        lista = factory.factoryList(a);
    }

    @Override
    public void push(E item) {
        lista.addLast(item);
    }

    @Override
    public E pop() {
        return (E) lista.removeLast();
    }

    @Override
    public E peek() {
        return (E) lista.getLast();
    }

    @Override
    public boolean empty() {
        return lista.isEmpty();
    }

    @Override
    public int size() {
        return lista.size();
    }

}
