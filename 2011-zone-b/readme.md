# 2011 Zone B Answers
---

## Question 1
* a) i) 0
* a) ii) 5
* a) iii) 6
* a) iv) 2
* a) v) 2500
* a) vi) Infinite
* a) vii) 0
* a) ix) 0

---

* b) i) 32 seconds
* b) ii) Worst-case Scenario for Binary Search: for any *N* there exists a query that takes exactly `⌊log2(*N*)+1⌋` iterations. Therefore, 6 seconds.
* b) iii) To swap the value of `c[i]` and `c[j]`.
* b) iv) The method will always `return false`

---

* c) i) Arrays are ﬁxed in length indexed using square brackets while vectors are dynamic, where elements can be added at the end or removed from the middle. Elements of vector are of type Object. (Based on Examiner’s Report 2014 zone B)
* c) ii)
```java
public static String longestString(Vector<String> v) {
	int longestIndex = 0;
	for(int i = 1; i < v.size(); i++)
		if(v.elementAt(i).length() > v.elementAt(longestIndex).length())
			longestIndex = i;
	return v.elementAt(longestIndex);
}
```

---

## Question 2

* a) i) 1
* a) ii) 1.5
* a) iii) 6

---

* b) i) D
* b) ii) -2147483648
* b) iii) Memory exhaustion
* b) iv) 65535

---

* c) i) 5
* c) ii) 5
* c) iii) hello
* c) iv) 5

---

## Question 3
> Answers in this section assume that `public static void main(int [] args)` is meant to be written as the Java main method, `public static void main(String[] args)`. Otherwise, the program will not run at all as a main method does not exist.

* a) i) \[1,2\]
* a) ii) \[3\]\[1,2\]

* b)
```java
class quadruple {
    pair firstPair, secondPair;
    public quadruple(int x1, int y1, int x2, int y2) {
        firstPair = new pair(x1, y1);
        secondPair = new pair(x2, y2);
    }
    public String toString() {
        return firstPair.toString() + "," + secondPair.toString();
    }
    public static void main(String [] args) {
        System.out.println(new quadruple(1, 2, 3, 4));
    }
}
```

* c)
```java
// class pair
boolean equality(pair comparison) {
    return this.first == comparison.first
        && this.second == comparison.second;
}
```

```java
// class triple
boolean equality(triple comparison) {
    return this.first == comparison.first
        && this.second == comparison.second
        && this.third == comparison.third;
}
```

```java
// class quadruple
boolean equality(quadruple comparison) {
    return this.firstPair.equality(comparison.firstPair)
        && this.secondPair.equality(comparison.secondPair);
}
```

---

## Question 4

* a) i) `x == 15`
* a) ii) `x == 7 || x == 91`
* a) iii) `x == 1 && y == 2 && z % 2 == 0`
* a) iv) `!(x == y || x == z || y == z)`

---

* b) i) `int`
* b) ii) `String`
* b) iii) `void` / no return
* b) iv) `char`

---

* c)
```java
static void copy(String g1, String g2) throws Exception {
    try {
        BufferedReader r = new BufferedReader(new FileReader(g2));
        BufferedWriter w = new BufferedWriter(new FileWriter(g1));

        int t = r.read();
        StringBuilder tmp = new StringBuilder();

        while(t != -1) {
            //tmp.append((char)t);
            w.append((char)t);
            t = r.read();
        }
        w.close();
        r.close();
    } catch(Exception e) {
        System.out.println("Error - The file " + g2 + " does not exist!");
    }
}
```
