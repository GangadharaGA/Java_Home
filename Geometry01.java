package Geometry;

import Geometry.Geometryfunc;
public class Geometry01 {

    public static void main(String[] args) {
        Geometryfunc g1=new Geometryfunc();
        g1.x=5;
        g1.y=10;

        Geometryfunc g2=new Geometryfunc();
        g2.x=10;
        g2.y=12;

        double Distance=g1.Distance(g2);
        double Angle=g1.angle(g2);

        System.out.println("(X1:"+g1.x+" Y1:"+g1.y+")"+"(X2:"+g2.x+" Y2:"+g2.y+")");
        System.out.println("Distance: "+Distance);
        System.out.println("Angle: "+Angle);
         System.out.println("Angle: Hi");


    }

}
