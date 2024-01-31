package Geometry;

public class Geometryfunc {

    public double x;
    public double y;

    public  double Distance(Geometryfunc p){
        return Math.sqrt(Math.pow((p.x-x),2))+Math.pow((p.y-y),2);
    }

    public  double angle(Geometryfunc p){
        return Math.toDegrees(Math.atan2((p.y-y),(p.x-x)));
    }
}
