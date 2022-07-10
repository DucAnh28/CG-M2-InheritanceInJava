package TH_1_GeometricObject;

public class Shape {
    private static String color = "green";
    private static boolean filled = true;

    Shape(){
    }

    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Shape.color = color;
    }

    public static boolean isFilled() {
        return filled;
    }

    public static void setFilled(boolean filled) {
        Shape.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
