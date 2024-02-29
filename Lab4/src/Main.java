public class Main {
    public static void main(String[] args) {
Circle c = new Circle(4.5);
System.out.println("--------Circle--------- ");
System.out.println("Radius: " + c.getRadius());
System.out.println("Area of a Circle: " + c.calculateArea());
System.out.println("Circumference of a Circle: " + c.calculateCircumference());
System.out.println("--------Rectangle--------- ");
Rectangle r = new Rectangle(2.6,6.8);
System.out.println("Height: " + r.getHeight());
System.out.println("Width: " + r.getWidth());
System.out.println("Area of a Rectangle: " + r.calculateArea());
System.out.println("Perimeter of a Rectangle: " + r.calculateCircumference());
System.out.println("--------Triangle--------- ");
Triangle t = new Triangle(8.8,4.4);
System.out.println("Height: " + t.getHeight());
System.out.println("Base: " + t.getBase());
System.out.println("Area of a Triangle: " + t.calculateArea());
System.out.println("Perimeter of a Triangle: " + t.calculateCircumference());
System.out.println("--------------------------");
    }
}
