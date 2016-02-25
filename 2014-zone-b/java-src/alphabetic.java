abstract class alphabetic implements ordering {
  static boolean compare(String s, String t) {
    return s.compareTo(t) < 0;
  }
}
