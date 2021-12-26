/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author saum
 */
//singly linked list class
public class SinglyLinkedList<E> {
//nested node class
    private static class Node<E> {
        //field
        private E element;
        private Node<E> next;
        //constructor
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
        //setters and getters
        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
    //fields
    private Node<E> head = null;
    private Node<E> tail = null;
    int size = 0;
    //constructors
    public SinglyLinkedList(){}
    //getter for size
    public int size() {
        return size;
    }
    //isEmpty
    public boolean isEmpty() {
        return (size == 0);
    }
    //returns last element
    public E last() {
        if (isEmpty())
            return null;
        else 
            return tail.getElement();
    }
    //returns first element
    public E first() {
        if (isEmpty())
            return null;
        else
            return head.getElement();
    }
    //adds element to the head of the list
    public void addFirst(E e) {
        Node <E> newNode = new Node<> (e, head);
        head = newNode;
        if (size == 0)
            tail = newNode;
        size++;
    }
    //adds element to end of list
    public void addLast(E e) {
        Node<E> newNode = new Node<> (e, tail);
        if (size == 0)
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }
    //removes and returns the first element in the list
    public E removeFirst() {
        if (isEmpty())
            return null;
        E firstElement = head.getElement();
        
        head = head.getNext();
        size--;
        if(size==0)
            tail = null;
        return firstElement;
    }
}
