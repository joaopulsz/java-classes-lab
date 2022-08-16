public class Rectangle {

    private float length;
    private float width;

    public Rectangle(float newRectangleLength, float newRectangleWidth) {
        this.length = newRectangleLength;
        this.width = newRectangleWidth;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle {length: " + this.length + ", width: " + this.width + "}.";
    }

    public float getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public float getArea() {
        return this.length * this.width;
    }

    public double getDiagonal() {
        return Math.sqrt((this.length * this.length) + (this.width * this.width));
    }
}
