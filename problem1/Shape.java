package Problem1;

public abstract class Shape {
    public String name;
    public String color;

    public abstract double computePerimeter();
    public abstract double computeArea();
    public abstract String toString();

    public String getColor(){
        return color;
    }

    public String getName() {
        return name;
    }


}
