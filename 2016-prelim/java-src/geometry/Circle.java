package geometry;
public class Circle extends Shape {
    private int radius;
    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printShape() {
        System.out.println("Color: " + super.getColor() + ", Radius: " + radius);
    }

    public boolean equals(Circle c) {
        return (c.getColor().equals(super.getColor())) && (radius == c.getRadius());
    }
}
