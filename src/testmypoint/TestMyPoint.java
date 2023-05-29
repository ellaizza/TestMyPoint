package testmypoint;

public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5, 12);
        MyPoint p3 = new MyPoint(20, 30);
        
        MyTriangle t = new MyTriangle(p1, p2, p3);
        System.out.println(p1);
        
        System.out.println(t);
        
        System.out.println(p2.distance());
        System.out.println(p2.distance(p3));
        System.out.println(p2.distance(15, 16));
        System.out.println("Perimeter = " + t.getPerimeter());
    }

}
