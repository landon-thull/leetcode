# 1108 - Defanging an IP Address

## Description

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
```text
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
```
## Pseudocode

1. Replace '.' with "[.]" and return.

## Code Explanation

```java
return address.replace(".", "[.]");
```
The java [replace](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#replace(char,char))
method takes 2 inputs, *searchChar* & *newChar*. It searches
the string to find *searchChar* and replaces it with *newChar*
We can simply return the result of the replace method.

## Time & Space Complexity

### Time Complexity
This solution has O(n) time complexity. The replace method
scans through the string in a linear fashion. If the input string
is 5 characters long, the replace method will step through 5 indexes.
If it is 10 characters long, it will step through 10 indexes.

### Space Complexity
This solution has O(n) space complexity. Due to the immutable nature
of Strings, the replace method does use additional memory to store
its output.

