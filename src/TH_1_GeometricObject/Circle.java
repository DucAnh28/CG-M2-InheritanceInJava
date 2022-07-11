package TH_1_GeometricObject;

public class Circle extends Shape {
    static double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public double getArea(){
        return radius* radius* Math.PI;
    }

    public double getPerimeter(){
        return 2* radius* Math.PI;
    }

    @Override
    public String toString() {
            return "A Circle with radius="
                    + getRadius()
                    + ", which is a subclass of "
                    + super.toString();
        }
}
