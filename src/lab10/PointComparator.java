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
 * @param <Point>
 */
//comparator for points
public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point point1, Point point2) throws ClassCastException{
        if (point1.getX() < point2.getX()) return -1; //if point1 is less than point 2
        else if (point1.getX() == point2.getX()) { //if they are equal you need to compare them again by the white coordinate
            if(point1.getY() < point2.getY()) return -1;
            else if(point1.getY() == point2.getY()) return 0;
            else return 1;
        }
        else return 1;
    }

}
