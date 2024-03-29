
package pkg1.s.p0061;


public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }
    
        @Override
    public void printResult() {
            System.out.println("----- Rectangle -----");
            System.out.println("Width: " + getWidth());
            System.out.println("Width: " + getLength());
            System.out.println("Area: "+getArea());
            System.out.println("Perimeter: "+getPerimeter());
    }
}
