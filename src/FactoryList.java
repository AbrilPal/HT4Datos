/**
 *
 * @author fuent
 */
public class FactoryList {

    public FactoryList(){

    }

    /**
     *
     * @param lista
     */
    public List factoryList(int lista){
        switch(lista){
            case 1: return new SingleLinkedList();
            case 2: return new DoublyLinkedList();
            case 3: return new CircularList();
            default: return null;
        }
    }

}
