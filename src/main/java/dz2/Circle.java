package dz2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    } // метод для вычесления площади круга

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }


}

