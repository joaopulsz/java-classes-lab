public class Main {

    public static void main(String[] args) {

//        CIRCLE
        Circle circle1 = new Circle(23.45);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getCircumference());
        System.out.println(circle1.toString());

        circle1.setRadius(98.56);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getCircumference());


//        RECTANGLE
        Rectangle rectangle1 = new Rectangle(45, 30);
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getDiagonal());

    }
}
