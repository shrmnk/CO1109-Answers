public class q6b {
  public static void main(String[] args) {
    Person p = new Person("John", "Smith", new Date(13, 12, 2003));
    System.out.printf("Name: %s %s%nDOB: %d %d %d", p.firstName, p.lastName, p.d.d, p.d.m, p.d.y);
  }
}
