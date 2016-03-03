package geometry;
public class Shape {
    private String color;
    public Shape() {
        color = "Red";
    }
    public Shape(String c) {
        color = c;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void printShape() {
        System.out.println("Color: " + this.color);
    }
}
