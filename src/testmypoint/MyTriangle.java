
package testmypoint;


public class MyTriangle {
   private MyPoint v1;
   private MyPoint v2;
   private MyPoint v3;
   
   //constructor
   public MyTriangle(MyPoint a, MyPoint b, MyPoint c){
       v1 = a;
       v2 = b;
       v3 = c;
   }
   
   public String toString(){
       return "MyTriangle [v1=" + v1.toString() + ", v2=" + v2.toString() + 
               ", v3=" + v3.toString() + "]";
   }
   
   public double getPerimeter(){
       double side1 = v1.distance(v2);
       double side2 = v2.distance(v3);
       double side3 = v3.distance(v1);
       return side1 + side2 + side3;
   }
}
