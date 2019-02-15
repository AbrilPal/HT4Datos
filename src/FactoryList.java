/**
 *
 * @author fuent
 * @since 15/02/2019
 */
public class FactoryList {
    /**
     * Constructor.
     */
    public FactoryList(){

    }

    /**
     *metodo factoryList
     * estedebulve elobjeto instanciado cuando elusuario escoje que lipoo de listta desea.
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
