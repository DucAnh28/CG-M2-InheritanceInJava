package BT_1_ClassCircleAndClassCylinder;

public class Cylinder extends Circle{
    private double height;

    public double getvolumetric(){
        return getArea()*height;
    }
}
