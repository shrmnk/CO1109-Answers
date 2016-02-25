abstract class Shorter implements ordering {
  static boolean compare(String s, String t) {
    return s.length() < t.length();
  }
}
