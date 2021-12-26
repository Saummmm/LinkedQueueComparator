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
public interface Queue<E> {
    //interface for queues
    int size();

    boolean isEmpty();

    E first();

    void enqueue(E e);

    E dequeue();
}
