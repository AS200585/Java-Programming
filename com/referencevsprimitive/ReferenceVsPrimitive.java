package com.referencevsprimitive;

import java.awt.Point;

public class ReferenceVsPrimitive {
    public static void main(String[] args){
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
//Reference types are copied by references while Primitive types are copied by values