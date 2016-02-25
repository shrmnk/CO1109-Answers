import java.util.Vector;
class vectorsort {
  public ordering order;

  Vector<String> sort(Vector<String> v) {
    boolean sorted = false;
    while(!sorted) {
      sorted = true;
      for(int i = 1; i < v.size(); i++) {
        if(order.compare(v.elementAt(i), v.elementAt(i-1))) {
          sorted = false;
          String tmp = v.elementAt(i);
          v.removeElementAt(i);
          v.insertElementAt(tmp, i-1);
        }
      }
    }
    return v;
  }

  public vectorsort(ordering order) {
    this.order = order;
  }
}
