import edu.princeton.cs.introcs.StdDraw;

public class Rectangle{

    //instance variables
    private double length;
    private double width;

    //constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //area method
    public double area(){
        return length*width;
    }

    //perimeter area
    public double perimeter(){
        return (2*length)+(2*width);
    }

    //toString method
    public String toString(){
        return "Rectangle length: " + length + ", Rectangle width: " + width;
    }

    //ifSquare method
    public boolean ifSquare(){
        if (length==width){
            return true;
        }
        else{
            return false;
        }
    }

    //ifSmaller method
    public boolean ifSmaller(Rectangle otherRectangle){
        if (this.area() < otherRectangle.area()){
            return true;
        }
        else{
            return false;
        }
    }

    //main method!
    public static void main(String[] args){
        Rectangle r1 = new Rectangle (0.6, 0.7); //shouldn't be a square, shouldn't be smaller
        Rectangle r2 = new Rectangle (0.6, 0.6); //should be a square, should be smaller
        System.out.println(r1);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Square?: " + r1.ifSquare());
        System.out.println("Smaller?: " + r1.ifSmaller(r2));
        System.out.println(r2);
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Square?: " + r2.ifSquare());
        System.out.println("Smaller?: " + r2.ifSmaller(r1));
    }


}