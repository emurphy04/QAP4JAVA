package Problem2;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name, String color, double side) {
        super(name, color, side, side, side);
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

    @Override
    public String toString() {
        return "This is an Equilateral Triangle named "+name+", it is "+color+" and has equal side lengths of "+side1+", an area of "+computeArea()+", and a perimeter of "+computePerimeter()+".";
    }
    
}
