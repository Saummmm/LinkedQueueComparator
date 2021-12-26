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
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrX = {5, 7, 50, 7}; //array of x coords
        int[] arrY = {6, 10, 4, 3}; //array of y coords
        Comparator<Point> comp = new PointComparator(); //comparator
        LinkedQueue<Point> q = new LinkedQueue<>(); //creating a queue object
        for (int i = 0; i < arrX.length; i++) {
            //creating point objects from the two arrays above
            Point p = new Point(arrX[i], arrY[i]);
            //adding the point objects to the queue
            q.enqueue(p);
        }   

        //printing out the queue
        for (int i = 0; i < q.size(); i++) {
            Point p = q.dequeue();
            if (i == 3) {
                System.out.println(p.toString());
            } else {
                System.out.print(p.toString() + ", ");
            }
            q.enqueue(p);
        }
        System.out.println("");
        
        //sorting the queue
        LinkedQueue.quickSort(q, comp);
        
        //printing out the queue
        for (int i = 0; i < q.size(); i++) {
            Point p = q.dequeue();
            if (i == 3) {
                System.out.println(p.toString());
            } else {
                System.out.print(p.toString() + ", ");
            }
            q.enqueue(p);
        }

    }

}
