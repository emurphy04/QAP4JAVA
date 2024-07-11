package Problem2;

public class Ellipse extends Shape{
    public double a;
    public double b;

    public Ellipse(String name, String color, double axis1, double axis2){
        this.name = name;
        this.color = color;
        if (axis1 > axis2){
            this.a = axis1;
            this.b = axis2;
        } else if (axis1 < axis2){
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double computePerimeter() {
        return (2*Math.PI)*(Math.sqrt((a*a + b*b)/2));
    }

    @Override
    public double computeArea() {
        return Math.PI*(a*b);
    }

    @Override
    public String toString() {
        return "This is an Ellipse named "+name+", it is "+color+" and has an axis of "+a+" and "+b+", an area of "+computeArea()+", and a perimeter of "+computePerimeter()+".";
    }

    @Override
    public void Scale(double Scale) {
        this.a = this.a*Scale;
        this.b = this.b*Scale;
        System.out.println("Axis is now "+a+" and "+b+" at "+Scale+" scale.");
    }
}
