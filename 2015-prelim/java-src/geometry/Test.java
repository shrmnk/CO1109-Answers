package geometry;
public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle("Blue", 10);
        Circle c2 = new Circle("Blue", 10);
        Circle c3 = new Circle();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle("Green", 1, 2);

        System.out.print("C1: ");
        c1.printShape();

        System.out.print("C2: ");
        c2.printShape();

        System.out.print("C3: ");
        c3.printShape();

        System.out.print("R1: ");
        r1.printShape();

        System.out.print("R2: ");
        r2.printShape();

        System.out.println();
        System.out.println("Equals test:");

        System.out.println("C1 vs C2: " + c1.equals(c2));
        System.out.println("C2 vs C3: " + c2.equals(c3));
        System.out.println("C1 vs C3: " + c1.equals(c3));

    }
}
