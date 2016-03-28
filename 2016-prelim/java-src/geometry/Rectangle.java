package geometry;
public class Rectangle extends Shape {
    private int sideOne, sideTwo;
    public Rectangle() {
        super();
        this.sideOne = this.sideTwo = 0;
    }

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return this.sideOne;
    }

    public void setSideOne(int s1) {
        this.sideOne = s1;
    }

    public int getSideTwo() {
        return this.sideTwo;
    }

    public void setSideTwo(int s2) {
        this.sideTwo = s2;
    }

    @Override
    public void printShape() {
        System.out.println("Color: " + super.getColor() + ", sideOne: " + sideOne + ", sideTwo: " + sideTwo);
    }
}
