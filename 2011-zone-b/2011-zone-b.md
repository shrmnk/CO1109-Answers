## Question 1
1. **Q1 Part A**
  1. 0
  2. 5
  3. 6
  4. 2
  5. 2500
  6. Infinite
  7. 0
  8. 0
2. **Q1 Part B**
  1. 32 seconds
  2. Worst-case Scenario for Binary Search: for any *N* there exists a query that takes exactly `⌊log2(*N*)+1⌋` iterations. Therefore, 6 seconds.
  3. To swap the value of `c[i]` and `c[j]`.
  4. The method will always `return false`
3. **Q1 Part C**
  1. Arrays are ﬁxed in length indexed using square brackets while vectors are dynamic, where elements can be added at the end or removed from the middle. Elements of vector are of type Object. (Based on Examiner’s Report 2014 zone B)
  2.
```java
public static String longestString(Vector<String> v) {
	int longestIndex = 0;
	for(int i = 1; i < v.size(); i++)
		if(v.elementAt(i).length() > v.elementAt(longestIndex).length())
			longestIndex = i;
	return v.elementAt(longestIndex);
}
```

## Question 2
