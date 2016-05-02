# 2014 Zone B Answers

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

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

*Answers in this section have been validated against the provided Marker's Report.*

* a) Arrays: fixed in length upon initialisation; Element referenced using index in square brackets

  Vectors: variable in length - Elements can be added or removed dynamically; Elements of vector are of type `Object`, referenced by `.elementAt()` method.

* b) Objects cannot be directly multiplied

* c) Primitive/basic variables must be made into Objects before being placed as `Object`s in Vectors.

* d) Retrieving an element of a `Vector` using `.elementAt()` will return an `Object`, where we must cast to an `Integer` before we can apply `intValue()` which returns its value as an `int`. This goes the same for the third element. The two `int` values can then be added using the `+` operator. The result is then made into a `new Integer()` before adding into the `Vector`.
```java
v.addElement(new Integer(
  ( (Integer)v.elementAt(0) ).intValue()
  + ( (Integer)v.elementAt(3) ).intValue()
) );
```
> `.intValue()` is not necessary as Java now does [Autoboxing/Unboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html). However, it is included here as this is what was represented in the Marker's Report.

* e)
```java
static int product(Vector v) {
  int productSum = 1;
  for(int i = 0; i < v.size(); i++)
    productSum *= ( (Integer)v.elementAt(i) ).intValue();
  return (productSum);
}
```

---

## Question 3

**Note: Abstract Classes/methods and Interfaces are not tested and not in the Year 1 syllabus. This question was apparently included by mistake.**

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

* a) *TODO: Object Serialisation?*

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

*Answers in this section have been validated against the provided Marker's Report.*

* a) i) (`unsigned` optional)

  `int`

  `int` / `long`

  `double` / `float`

  `boolean`


* a) ii)
```java
public class q6aii {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < args.length; i++)
      sum += Integer.parseInt(args[i]);
    System.out.println(sum);
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
