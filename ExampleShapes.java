abstract class Shape{

protected String color;
protected boolean filled;

public Shape()

{}

public Shape(String color,boolean filled)
{
this.color=color;
this.filled=filled;
}
public String getColor() 
{
        return color;
  }
public void setColor(String color)
 {
        this.color = color;
    }

public boolean isFilled()
{
        return filled;
    }
public void setFilled(boolean filled)
{
        this.filled = filled;
    }

 abstract public double getArea();
 abstract public double getPerimeter();

    
public String toString() {
   return "Shape[color=" + color + "and " + (filled ? "filled" : "not filled") + "]";
}

}

 class Circle extends Shape {

    protected  double radius;

    public Circle() {
       
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public String toString() {
        
        
          return "Circle[circle with radius=" + radius + "]";

    }
}

class Rectangle extends Shape {

    protected  double width;
    protected  double length;

    public Rectangle(){}
 
    public Rectangle(double width, double length)

 {
        super();
        this.width  = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
 {
        super(color, filled);
        this.width  = width;
        this.length = length;
    }

    public double getWidth() 
{
        return width;
    }

    public void setWidth(double width) 
{
        this.width = width;
    }

    public double getLength()
 {
        return length;
    }

    public void setLength(double length)
 {
        this.length = length;
    }

    public double getArea() 
{
        return width*length;
    }

    public double getPerimeter() 
{
        return 2*(width+length);
    }

   
    public String toString() {
        
        return "Rectangle[ A Rectangle with width =" + width + "length= " + length + "]";
    }
}

class Square extends Rectangle {

    public Square() {}

    public Square(double side) 
{
        super(side,side);
    }

    public Square(double side, String color, boolean filled)
 {
        super(side, side, color, filled);
    }

    public double getSide() 
{
        return getWidth();
    }

    public void setSide(double side)
 {
        setWidth(side);
        setLength(side);
    }

   
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    public String toString() {
        
         return "Square[Square with side=" + width + "]";
    }
}


public class ExampleShapes {

    public static void main(String[] args) {

        Circle s1 = new Circle(5.5, "RED", false);  
        System.out.println(s1);                    
        System.out.println(s1.getArea());          
        System.out.println(s1.getPerimeter());     
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());   
           
        Circle c1 = (Circle)s1;                   
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
           
                 
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
                   
        Rectangle r1 = (Rectangle)s3;   
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
           
        Square s4 = new Square(6.6);     
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());   
          
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());    
        System.out.println(r2.getLength());
           
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }

}