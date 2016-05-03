# 2012 Zone B Exam Paper

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 01

#### Part A

* a(i) No syntax error
* a(ii) Missing semicolon after statement
* a(iii) Non-static variable cannot be referenced from a static context
* a(iv) Wrong method signature. Method accessor should be declared first, e.g. `static char q(int x)`

#### Part B
``` java
//b(i)
for (int i = m; i > 0; i--) {
    System.out.println(i);
}
```
```java
//b(ii)
if (a && c) {
    x += 2;
}
```

```java
//b(iii)
y = y + 1;
```

```java
//b(iv)
static void f(int n) {
    for (int i = n; i < 0; i++) {
        System.out.println("hello");
    }
}
```

#### Part C

```java
//c(i)
int min(int a, int b) {
    if (a > b) return b;
    else return a;
}
```

```java
//c(ii)
int minOf3(int a, int b, int c) {
    min(min(a, b), c);
}
```

## Question 02

#### Part A

* a(i) Error - Array Index Out Of Bounds
* a(ii) `5`
* a(iii) `0123456789`

#### Part B

```
//b(i)
0
1
1
3
4
5
6
```

* b(ii) `tac`

```java
//c(i)
static int count(char a, String s) {
   int count = 0;
   for (int i = 0; i < s.length() - 1; i++) {
        if (s.charAt(i) == a) {
            count++;
        }
    }
    return count;
}
```

```java
//c(ii)
static boolean reverse(String s, String t) {
    if(s.length() != t.length()) {
        return false;
    }
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != t.charAt(t.length() - i - 1)) {
            return false;
        }
    }
    return true;
}
```

## Question 03

#### Part A

* a(i) 2
* a(ii) incompatible types: String cannot be converted to Integer
* a(iii):

```
hello
be
a
2
1
0
```

#### Part B

* b(i) NumberFormatException

```java
//b (ii)
public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean carryOn = true;
        System.out.println("Enter Number>");
        while (carryOn) {
            String s = in.nextLine();
            try  {
                int x = Integer.parseInt(s);
                System.out.println("The answer is "  + (x+1));
                // first bit of missing code:
                carryOn = false;
            }
            catch (Exception e) {
                // second bit of missing code:
                System.out.println("Error! Please enter an integer.");
            }
        }
}
```

#### Part C

```java
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        boolean fileFound = true;
        Vector<String> v = new Vector<String>();
        while (fileFound) {
            System.out.print("Enter filename>");
            String fileName = userin.nextLine();
            try {
                Scanner in = new Scanner(new FileReader(fileName));
                while (in.hasNextLine()) {
                    v.add(in.nextLine());
                }
                fileFound = false;
            } catch (FileNotFoundException e) {
                System.out.println("File not found! Please enter another filename.");
                fileFound = true;
            }
        }
    }
```

## Question 04

#### Part A

* a(i) `Date date = new Date(4,6,2013);`

```java
a(ii)
public boolean equals(Date d) {
        if (day == d.day && month == d.month && year == d.year) return true;
        else return false;
    }
```

#### Part B
```java
b(i)
public class Student {
    String name;
    boolean gender;
    Date date;

    public Student(String n, boolean g, Date d) {
        name = n;
        gender = g;
        date = d;
    }

  public boolean equals(Student s) {
        return s.name.equals(name) && s.gender == gender && date.equals(s.date);
    }
}
```

#### Part C


---

###### Contributors
> These people helped to make the above answers: [@hong-yi](https://github.com/hong-yi)
