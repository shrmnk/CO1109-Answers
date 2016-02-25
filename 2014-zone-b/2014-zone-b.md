# 2014 Zone B Answers
---

## Question 1

1. b) Clarified by Ms Denise Miller - `cat()` is to be replaced with `g()`. Therefore, the source code of the program will be output

2. c) When the BufferedReader file pointer reaches the end of the file.

3. d) Nothing would appear on the output. This is because the program will immediately reach the end of the file upon reading it as it is empty, hence, the while() loop will not run.

4. e) g

5. f) `s.substring(0, s.length()-1);`

6. g) Clarified by Ms Denise Miller - All ‘`c`’s to ‘`d`’s and ‘`d`’s to ‘`c`’s.

```java
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


## Question 2

*These answers are provided in the Marker’s Report, with code corrected and formatted.*

2.
  1. Arrays fixed in length indexed using square brackets vectors are dynamic elements can be added at the end or removed from the middle. Elements of vector are of type Object.

  2. Can’t multiply objects

  3. In order handle the basic types as objects 1 is equivalent to `new Integer(1)`.

  4. `v.elementAt(0)` is of type `Object` so we must cast it to `Integer` before we can apply `intValue()` which returns its value as an int. similarly for `v.elementAt(3)` We can then add together these two `int` values using `+`. Before we add the result to the vector we must convert it back to `Integer`. using `new Integer(...)`
```java
  v.addElement(new Integer(
  ( (Integer)v.elementAt(0) ).intValue() +
  ( (Integer)v.elementAt(3) ).intValue()
);
```

  5.
  ```java
  static int product(Vector v) {
  int tot = 1;
  for(i = 0; i < v.size(); i++)
    tot = tot * ((Integer)v.elementAt(i)).intValue();
  return (tot);
}
```

## Question 3

**Note: Abstract Classes/methods and Interfaces are not tested.**

3.
  1. Abstract methods are contained in abstract classes, and are declared without an implementation (NOTE:  https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html).

  2. An interface is similar to a class, but is instead a reference type that contains only constants, method signatures, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods. These interfaces can only be implemented by classes or extended by other interfaces (NOTE:  https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html).

  3. i)
```java
abstract class Shorter implements ordering {
  static boolean compare(String s, String t) {
    return s.length() < t.length();
  }
}
```
  ii)

```java
abstract class alphabetic implements ordering {
  static boolean compare(String s, String t) {
    return s.compareTo(t) < 0;
  }
}
```
  iii) <TBF>


## Question 4

4 a) What is Object Serialisation ?

4 b) 2

4 c)

<table>
  <tr>
    <td>  public static int mult(int n, int m) {
    if(m > 0)
      return n + mult(n, m-1);
    else
      return 0;
  }</td>
  </tr>
</table>


4 d)

<table>
  <tr>
    <td>  public static int power(int m, int n) {
    if(n == 0) return 1;
    if(n == 1) return m;
    if(n < 0) return 0; // Because this is an int method, any fraction will always return 0
    n -= 1;

    int result = m;
    for(int i = n; i > 0; i--)
      result *= m;
    return result;
  }</td>
  </tr>
</table>


## Question 5

5 a)
```
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
5 b)
```java
public static double averageOfArray(int[][] arr) {
    if(arr.length < 1) return 0;
    int totalElements = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if(arr[i].length == 0) continue; // Skip if array is empty
      totalElements += arr[i].length;
      for(int j = 0; j < arr[i].length; j++)
        sum += arr[i][j];
    }

    return (double)sum / totalElements;
  }
```


## Question 6

Answers are from examiner’s report.

6 a) (i) What would be the appropriate type for variables that represent each of the following:

i. The number of people in India

ii. The distance from London to Khartoum measured to the nearest kilometre.

iii. The average number of children per family.

iv. Whether a person is aged over 65 or not.

Answer:

i. int

ii. int / long

iii. double / float

iv. boolean

[4 Marks]

6 a) (ii) Make up a simple Java program that prints out the sum of all command line arguments supplied to it (assume they are all integers).

Answer:

<table>
  <tr>
    <td>public class A {
  public static void main(String[] args) {
    int total=0;
    for (int i=0;i<args.length;i++) total += Integer.parseInt(args[i]);
    System.out.println(total);
  }
}</td>
  </tr>
</table>


[ 5 Marks ]

6 b) (i) beta

6 b) (ii) 0

6 c)

## Question 5
