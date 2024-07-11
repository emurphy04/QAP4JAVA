package Problem1;

public class Circle extends Shape {
    public double radius;

    public Circle(String name, String color, double radius){
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double computePerimeter() {
        return 2*(Math.PI*radius);
    }

    @Override
    public double computeArea() {
        return (Math.PI*(radius*radius));
    }

    @Override
    public String toString() {
        return "This is a Circle named "+name+", it is "+color+" and has a radius of "+radius+", an area of "+computeArea()+", and a perimeter of "+computePerimeter()+".";
    }
}
