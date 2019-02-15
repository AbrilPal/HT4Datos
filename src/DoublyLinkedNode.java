/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuent
 */
public class DoublyLinkedNode <E>
{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }
    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    public E value (){
        return data;
    }
    public DoublyLinkedNode<E> next(){
        return nextElement;
    }
    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }
    public void setNext(DoublyLinkedNode<E> e){
        nextElement = e;
        e.previousElement=this;
    }
}
