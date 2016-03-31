# 2016 Prelim Answers

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Work-in-Progress

All Java sources are available in the `java-src` directory

---

## Question 1

* a) i) 6.0
* a) ii) 7.0
* a) iii) 3.0
* a) iv) 3.3333333
* a) v) true
* a) vi) 1.12.2
* a) vii) ILLEGAL
* a) viii) ILLEGAL (because addition of non-integers)
* a) ix) 123

---

* b) /TODO

---

* c) `3`

---

* d)
```java
import java.util.Vector;

public class q1d {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));

        System.out.println(product(v));
    }

    static int product(Vector v) {
        int sum = 0;
        for(int i = 0; i < v.size(); i++)
            sum += (int)v.elementAt(i);

        return sum;
    }
}
```

---

## Question 2

* a)

```
ten
twenty
```

---

* b) `-2`; There were no "two columns" given in the question

---

* c)

```java
static void replace(String input, String seed, String replacement) {
    boolean done = false;
    while(!done) {
        done = true;
        if(input.indexOf(seed) >= 0) {
            input = input.substring(0, input.indexOf(seed)) + replacement
             + input.substring(input.indexOf(seed) + seed.length());
             done = false;
        }
    }
    System.out.print(input);
}
```

---

* d) i)

```java
int minOf2(int x, int y) {
    return x < y ? x : y;
}
```

* d) ii)

```java
int minOf3(int x, int y, int z) {
    return minOf2(x, minOf2(y, z));
}
```

---

## Question 3

* a) It prints a symmetrical diamond shape with asterixes totaling 9 lines long, with its left apex 5 spaces from the edge.

---

* b)

```java
int maxLength(String[] s) {
    int max = s[0].length();
    for(int i = 1; i < s.length; i++)
        if(s[i].length() > max)
            max = s[i].length();
    return max;
}
```

---

* c)

```java
void avg2D(int[][] arr) {
    for(int i = 0; i < arr.length; i++) {
        int sum = 0;
        for(int z = 0; z < arr[i].length; z++)
            sum += arr[i][z];
        System.out.println(sum / (double) arr[i].length);
        sum = 0;
    }
}
```

---

## Question 4

* a) i) It prints out all odd numbers starting from 1 until the given input.

* a) ii)

```java
import java.util.Scanner;
class Class1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number>");
        int x = in.nextInt();
        int i = 0;
        while(i < x) {
            System.out.println(i + 1);
            i += 2;
        }
    }
}
```

---

* b) i) `two`
* b) ii) `100`

---

* c)

```java
int count7(int n) {
    if(n == 0) return 0;
    else if(n % 10 == 7)
        return 1 + count7(n / 10);
    return count7(n/10);
}
```

---

## Question 5

* a) i) `e`
* a) ii) `hello`
* a) iii) The output will be: `Number of occurences: 0`; This is because the check for whether the strings are equal is using the `==` operator, which would compare the Objects. Instead, to compare the contents of these two String Objects, we should use the `String.equals()` method

---

* b) This code prints out all the contents of the file named _"file1"_

---

* c)
```java
void copy(String g1, String g2) throws Exception {
    boolean g1Exists = true;
    try {
        FileReader checkFile = new FileReader(g1);
    } catch (Exception e) {
        g1Exists = false;
        System.out.println(g1 + " does not exist!");
    }

    if(g1Exists) {
        Scanner t = new Scanner(new FileReader(g2));
        FileWriter w = new FileWriter(g1);
        BufferedWriter output = new BufferedWriter(w);
        while(t.hasNext()) {
            output.append(t.nextLine() + "\n");
        }
        output.close();
    }

}
```

---

## Question 6

##### Shape.java

```java
package geometry;
public class Shape {
    private String color;
    public Shape() {
        color = "Red";
    }
    public Shape(String c) {
        color = c;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void printShape() {
        System.out.println("Color: " + this.color);
    }
}
```

##### Circle.java

```java
package geometry;
public class Circle extends Shape {
    private int radius;
    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printShape() {
        System.out.println("Color: " + super.getColor() + ", Radius: " + radius);
    }

    public boolean equals(Circle c) {
        return (c.getColor() == super.getColor()) && (radius == c.getRadius());
    }
}
```

##### Rectangle.java

```java
package geometry;
public class Rectangle extends Shape {
    private int sideOne, sideTwo;
    public Rectangle() {
        super();
        this.sideOne = this.sideTwo = 0;
    }

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return this.sideOne;
    }

    public void setSideOne(int s1) {
        this.sideOne = s1;
    }

    public int getSideTwo() {
        return this.sideTwo;
    }

    public void setSideTwo(int s2) {
        this.sideTwo = s2;
    }

    @Override
    public void printShape() {
        System.out.println("Color: " + super.getColor() + ", sideOne: " + sideOne + ", sideTwo: " + sideTwo);
    }
}
```

---

###### Contributors
> These people helped to make the above answers: @shrmnk @hong-yi