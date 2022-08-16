public class Circle {

    private double radius;

    public Circle(double newCircleRadius) {
        this.radius = newCircleRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle {radius: " + this.radius + "}.";
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
    }
}
