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

* b) i) 32 seconds
* b) ii) Worst-case Scenario for Binary Search: for any *N* there exists a query that takes exactly `⌊log2(*N*)+1⌋` iterations. Therefore, 6 seconds.
* b) iii) To swap the value of `c[i]` and `c[j]`.
* b) iv) The method will always `return false`


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

* b) i) D
* b) ii) -2147483648
* b) iii) Memory exhaustion
* b) iv) 65535

* c) i) 5
* c) ii) 5
* c) iii) hello
* c) iv) 5
