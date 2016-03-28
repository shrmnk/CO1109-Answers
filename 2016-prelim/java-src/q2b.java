public class q2b {
    private int x;
    private int y;
    public q2b() {
        x = 3; y = 6;
    }
    private void first(int z) {
        x = z; y++;
    }
    private void second(int s, int t) {
        setXY( (y+t), (x-s));
        s = 1; t = 3;
    }
    private void setXY(int s, int y) {
        x = s;
        this.y = y;
        first(y);
    }
    private void display() {
        System.out.println(x + y);
    }
    public void startUp() {
        first(y);
        second(y,x);
        display();
    }
    public static void main(String[] args) {
        q2b c = new q2b();
        c.startUp();
    }
}
