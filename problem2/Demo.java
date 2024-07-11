package Problem2;

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

        System.out.println("");

        ArrayList<Scalable> scalables = new ArrayList<Scalable>();
        scalables.add(new Triangle("Clark", "Blue", 4, 6, 4));
        scalables.add(new EquilateralTriangle("Bruce", "Black", 13));
        scalables.add(new Circle("Barry", "Red", 9));
        scalables.add(new Ellipse("Hal", "Green", 4.7, 6));

        for(int i = 0; i < scalables.size(); i++){
            System.out.println(scalables.get(i));
        }

        System.out.println("");

        for(int i = 0; i < scalables.size(); i++){
            scalables.get(i).Scale(Math.random()*10);;
        }

        System.out.println("");

        for(int i = 0; i < scalables.size(); i++){
            System.out.println(scalables.get(i));
        }
    }
}
