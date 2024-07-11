package Problem2;

public class Triangle extends Shape{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(String name, String color, double side1, double side2, double side3){

        if((side1+side2)>side3){
            if((side2+side3)>side1){
                if((side3+side1)>side2){
                    this.name = name;
                    this.color = color;
                    this.side1 = side1;
                    this.side2 = side2;
                    this.side3 = side3;
                } else {
                    System.out.println("Invalid sides.");
                    System.exit(0);
                }
            } else {
                System.out.println("Invalid sides.");
                System.exit(0);
            }
        } else{
            System.out.println("Invalid sides.");
            System.exit(0);
        }

        
    }

    @Override
    public double computePerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double computeArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public String toString() {
        return "This is a Triangle named "+name+", it is "+color+" and has side lengths of "+side1+", "+side2+", "+side3+", an area of "+computeArea()+", and a perimeter of "+computePerimeter()+".";
    }

    @Override
    public void Scale(double Scale) {
        this.side1 = this.side1*Scale;
        this.side2 = this.side2*Scale;
        this.side3 = this.side3*Scale;
        System.out.println("All sides are at "+Scale+" scale.");
    }
}
