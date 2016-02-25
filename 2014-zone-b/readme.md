# 2014 Zone B Answers
---

## Question 1

* b) Clarified by Ms Denise Miller - `cat()` is to be replaced with `g()`. Therefore, the source code of the program will be output

* c) When the `BufferedReader` file pointer reaches the end of the file.

* d) Nothing would appear on the output. This is because the program will immediately reach the end of the file upon reading it as it is empty, hence, the `while()` loop will not run.

* e) g

* f) `s.substring(0, s.length()-1);`

* g) Clarified by Ms Denise Miller - All ‘`c`’s to ‘`d`’s and ‘`d`’s to ‘`c`’s.

```java
// Question 1g)
import java.io.*;
public class q1g {
  public static void main(String[] args) throws Exception{
    BufferedReader inone = new BufferedReader(new FileReader(args[0]));
    int t = inone.read();
    while(t != -1) {
      if(t == (int)'c')
        System.out.print('d');
      else if(t == (int)'d')  // We are assuming that there is a typo in the paper
        System.out.print('c');
      else
        System.out.print((char)t);
      t = inone.read();
    }
  }
}
```

---

## Question 2

*These answers are provided in the Marker’s Report, with code corrected and formatted.*
* a) Arrays fixed in length indexed using square brackets vectors are dynamic elements can be added  at the end or removed from the middle. Elements of vector are of type Object.

* b) Can’t multiply objects

* c) In order handle the basic types as objects 1 is equivalent to `new Integer(1)`.

* d) `v.elementAt(0)` is of type `Object` so we must cast it to `Integer` before we can apply `intValue()` which returns its value as an int. similarly for `v.elementAt(3)` We can then add together these two `int` values using `+`. Before we add the result to the vector we must convert it back to `Integer` using `new Integer(...)`
```java
v.addElement(new Integer(
  ( (Integer)v.elementAt(0) ).intValue() +
  ( (Integer)v.elementAt(3) ).intValue()
);
```

* e)
```java
static int product(Vector v) {
  int tot = 1;
  for(i = 0; i < v.size(); i++)
    tot = tot * ((Integer)v.elementAt(i)).intValue();
  return (tot);
}
```

---

## Question 3

**Note: Abstract Classes/methods and Interfaces are not tested.**

* a) Abstract methods are contained in abstract classes, and are declared without an implementation (NOTE:  https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html).

* b) An interface is similar to a class, but is instead a reference type that contains only constants, method signatures, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods. These interfaces can only be implemented by classes or extended by other interfaces (NOTE:  https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html).

* c) i)
```java
public class Shorter implements ordering{
    public boolean compare(Object s, Object t) {
        String s1 = "";
        String s2 = "";
        if(s instanceof String) {
            s1 = (String) s;
        }
        if(t instanceof String) {
            s2 = (String) t;
        }
        return s1.length() < s2.length();
    }
}
```
* c) ii)
```java
public class alphabetic implements ordering {
    public boolean compare(Object s, Object t) {
        String s1 = "";
        String s2 = "";
        if(s instanceof String) {
            s1 = (String) s;
        }
        if(t instanceof String) {
            s2 = (String) t;
        }
        return s1.compareTo(s2) < 0;
    }
}
```
* d)
```java
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
```

---

## Question 4

* a) Object Serialisation

* b) 2

* c)
```java
public static int mult(int n, int m) {
  if(m > 0)
    return n + mult(n, m-1);
  else
    return 0;
}
```
* d)
```java
public static int power(int m, int n) {
  if(n == 0) return 1;
  if(n == 1) return m;
  if(n < 0) return 0; // Because this is an int method, any fraction will always return 0
  n -= 1;
  int result = m;
  for(int i = n; i > 0; i--)
    result *= m;
  return result;
}
```

---

## Question 5

* a)
```java
*****
****                                                                                                                                                                                                                                      ***
**
*
*
**
***
****
*****
```

* b)
```java
public static double averageOfArray(int[][] arr) {
  if(arr.length < 1) return 0;
  int totalElements = 0;
  int sum = 0;

  for(int i = 0; i < arr.length; i++) {
    if(arr[i].length == 0) continue; // Skip if array is empty
    totalElements += arr[i].length;
    for(int j = 0; j < arr[i].length; j++)
      sum += arr[i][j];
  }

  return (double)sum / totalElements;
}
```

---

## Question 6

*Answers are from examiner’s report.*

* a) i)
  `int`

  `int` / `long`

  `double` / `float`

  `boolean`


* a) ii)
```java
public class A {
  public static void main(String[] args) {
    int total=0;
    for (int i=0;i<args.length;i++) total += Integer.parseInt(args[i]);
    System.out.println(total);
  }
}
```

* b) i) beta

* b) ii) 0

* c)
```java
// Using char arrays
public static String reverse(String original) {
  char[] tmp = original.toCharArray();
  char[] reversed = new char[tmp.length];
  for(int i = tmp.length - 1; i >= 0; i--)
    reversed[tmp.length - i - 1] = tmp[i];
  return new String(reversed);
}
```
```java
// Using string concatenation
public static String reverse(String original) {
  String tmp = "";
  for(int i = original.length() - 1; i >= 0; i--)
    tmp += original.charAt(i);
  return tmp;
}
```

---

###### Contributors
> These people helped to make the above answers: [@shrmnk](https://github.com/shrmnk) [@vctortangggg](https://github.com/vctortangggg)
