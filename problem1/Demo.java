package Problem1;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Triangle("Terry", "Red", 3, 5, 3));
        shapes.add(new EquilateralTriangle("Gary", "Green", 7));
        shapes.add(new Circle("Jerry", "Blue", 7));
        shapes.add(new Ellipse("Gerry", "Yellow", 5.7, 8));
        
        for(int i = 0; i < shapes.size(); i++){
            System.out.println(shapes.get(i));
        }
    }
}
