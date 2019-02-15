        /**
        * La interfaz Stack define el contrato que han de seguir las clases que lo implementen
        *
        * @author fuent
        * @param <E>
         */
public interface Stack <E>{

    /**
     * El metodo push agrega el parametro item a la lista
     * @param item
     */
    public void push (E item);

    /**
     * El metodo pop elimina el ultimo objeto de la lista y lo retorna
     * @return El ultimo elemento de la lista
     */
    public E pop();

    /**
     * @return El ultimo elemento de la lista
     */
    public E peek();

    /**
     * El metodo empty permite saber si el stack esta vacio o no
     * @return True si el stack esta vacio. False de lo contrario
     */
    public boolean empty();

    /**
     * El metodo size permite saber el tamaño del stack
     * @return El tamaño del stack
     */
    public int size();

}
