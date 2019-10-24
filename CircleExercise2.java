package myPackage;

public class CircleExercise2 {

    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "The circle has radius:" + radius + "and his color is: " + color;
    }

    public static void main(String[] args) {

    }

}
