/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Comparator;

/**
 *
 * @author saum
 */
//Linked queue class
public class LinkedQueue<E> implements Queue<E> {
    
    //linked queue implemented witha singly linked class
    private SinglyLinkedList<E> list;

    public LinkedQueue() { //constructor
        list = new SinglyLinkedList<>();
    }

    @Override
    public int size() { //accessing the size of the list
        return list.size();
    }

    @Override
    public boolean isEmpty() { //returns true if list is empty
        return list.isEmpty();
    }
    
    //adds queue element to the end of the list
    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }
    
    //returns the first element in the queue
    @Override
    public E first() {
        return list.first();
    }
    
    //returns and removes the first item in the queue
    @Override
    public E dequeue() {
        return list.removeFirst();
    }
    
    //quick sort method
    public static <E> void quickSort(LinkedQueue<E> S, Comparator<E> comp) {
        int n = S.size();
        if (n < 2) { //queue is sorted
            return; 
        }
        //divide original queue into L,E,G
        E pivot = S.first();
        LinkedQueue<E> L = new LinkedQueue<>();
        LinkedQueue<E> E = new LinkedQueue<>();
        LinkedQueue<E> G = new LinkedQueue<>();
        while (!S.isEmpty()) {
            E element = S.dequeue();
            int c = comp.compare(element, pivot);
            if (c < 0) { //element is less than pivot
                L.enqueue(element);
            } else if (c == 0) { //element is equal to the pivot
                E.enqueue(element);
            } else { //element is greater than pivot
                G.enqueue(element);
            }
        }
        //conquer
        quickSort(L, comp);
        quickSort(G, comp);

        while (!L.isEmpty()) {
            S.enqueue(L.dequeue());
        }
        while (!E.isEmpty()) {
            S.enqueue(E.dequeue());
        }
        while (!G.isEmpty()) {
            S.enqueue(G.dequeue());
        }

    }

}
