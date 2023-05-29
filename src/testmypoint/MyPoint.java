package testmypoint;

class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {
        //constructor #1  
    }

    public MyPoint(int a, int b) {
        //constructor #2
        x = a;
        y = b;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    //public getters and setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = new int[2]; //declaration & instantiation of java array
        arr[0] = x; // initialization
        arr[1] = y; //and initialization
        return arr;
    }

    public void setXY(int a, int b) {
        x = a;
        y = b;
    }

    /*
     Compilation is the process the computer takes to convert a java program
     into a machine language that the computer can understand (0's and 1's).
     The software which performs this conversion is called a compiler.
     */

    /*
     Polymorphism means "many forms"
     There are two types of polymorphism in Java:
     compile-time polymorphism and runtime polymorphism
     Type 1: Compile-time polymorphism
     It is also known as static polymorphism.
     This type of polymorphism is achieved by method overloading.
     */
    double distance(MyPoint p2) {
        return Math.sqrt(Math.pow((x - p2.x), 2) + Math.pow((y - p2.y), 2));
    }

    double distance(int a, int b) {
        return Math.sqrt(Math.pow((x - a), 2) + Math.pow((y - b), 2));
    }

    double distance() {
        return Math.sqrt(x * x + y * y);
    }
    /*
     overloading/Compile-time polymorphism is when in one class we define/write
     two or more methods with the same name but different parameter list.
     */
}
