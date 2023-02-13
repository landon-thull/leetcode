# 1119 - Remove Vowels from a String
## Description
Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

## Pseudocode
1. Initialize a blank store for the output
2. loop through the input string character by character\
&nbsp; 1. Check if the character is a vowel\
&nbsp; 2. If it isn't, add it to the output string
3. Return the output string

## Code Explanation
```java
StringBuffer sb = new StringBuffer(s.length());
```
First, we initialize a StringBuffer the same length as the input string.
We do this because we know that the output cannot be any longer than the input.
StringBuffer is more efficient in terms of time & space complexity because it is mutable
unlike string, which would create a new instance every time we concatenate.
---
```java
for (int i = 0; i < s.length(); i++) {
    if (!isVowel(s.charAt(i))) {
        sb.append(s.charAt(i));
    }
}
return sb.toString();
```
We now use a for loop to access each character within the input string.
We then use a helper function called isVowel to decide if the character
is a vowel or not. If the character is NOT a vowel, we add it to the StringBuffer.
Else, we continue the loop. After finishing the loop, we convert the stringBuffer
to a string and return it.
---
```java
public static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
```
This is the helper function isVowel. It takes a character as input, and returns
a boolean. Here we use implicit return instead of an if then statement.
If any of the values in the return statement evaluate to true, the function will
return true.

## Time & Space Complexity
### Time Complexity
This solution has O(n) time complexity. If the input string has 5 characters,
We will run through the for loop 5 times. If it has 10 we will run through it 10 times.
### Space Complexity
This solution has O(n) space complexity. Because we are using a StringBuffer,
it will only x amount of space, with x being the length of the input string.
If we were to use a normal String, it would be less efficient, as strings are
immutable and a new copy out be made everytime we append a non-vowel character.