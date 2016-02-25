public class q1b {
  public static void main(String[] args) {
    // commented = got error because type check failed
    //System.out.println("   i." + Math.abs("freeing"));
    System.out.println("  ii." + Math.abs("morn".length()));
    System.out.println(" iii." + (Math.abs("morning".length()) + 7));
    System.out.println("  iv." + ("fruitify".charAt( Math.abs("bark".length())-3 )));
    //System.out.println("   v." + ("cuttlefish".compareTo(8)));
    System.out.println("  vi." + ("soya".compareTo("battleship")));
    System.out.println(" vii." + ("under".compareTo("2")));
    System.out.println("viii." + ("break".compareTo("2") + 17));
    System.out.println("  ix." + ("apple".replace('a', "orange".charAt(0))));
    System.out.println("   x." + ("frog".replace('b', "cart".charAt(0))).length());
  }
}
