# 1528 - Shuffle String

## Description
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

## Pseudocode
1. Create an empty array the same length as the input string.
2. Loop through the *indices*. \
&nbsp; add the character to the array at the index specified in *indices*.
3. Return the array converted to a string.

## Code Explanation
```java
char[] chars = new char[s.length()];
```
First, we initialize an empty character array that is the same length as the input String. This array will be used to store the characters from the String *s* at the indexes specified by *indices*.

---
```java
for (int i = 0; i < indices.length; i++){
        chars[indices[i]]=s.charAt(i);
}
```
This for loop takes each character in *s*, and places it at the index specified by *indices*. If the first character of the string was 's', and the first integer in *indices* was 4, 's' would be placed into the char array at index 4 (chars[4] = 's').

---
```java
return new String(chars);
```
Lastly, we convert the array of chars to a string and return it. The String constructor accepts an array of characters as an arguement, and will convert them a string.
## Time & Space Complexity
### Time Complexity
This solution has O(n) time complexity. The for loop runs *x* times, with *x* being the length of the input String *s*.
### Space Complexity
This solution has O(n) space complexity. We create a char array *x* characters long, with *x* being the length of the input String *s*;