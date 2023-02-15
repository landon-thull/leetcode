# 1221 - Split a String in Balanced Strings
## Description
Balanced strings are those that have an equal quantity of `L` and `R` characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

## Pseudocode
1. Initialize an integer *amt* to keep track of the number of substrings found.
2. Initialize an integer *count* to keep track of instances of `L` and `R` found.
3. Loop through each character in the input string. \
   &nbsp; 1. If the character == 'R', increment *count*. \
   &nbsp; 2. If the character == 'L', decrement *count*. \
   &nbsp; 3. If *count* == 0, increment *amt*.
4. Return *amt*.

## Code Explanation
```java
int amt = 0;
int count = 0;
```
The integer *amt* will keep track of the total number of substrings found. The integer count will be incremented when a `R` is found, and decremented when a `L` is found. When *count* equals 0, we will know that we have an equal number of `R`'s and `L`'s at the given point in the string, which means we have found a valid substring.

---
```java
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == 'R') {
        count++;
    } else {
        count--;    
    }
    
    if (count == 0) {
        amt++;    
    }
}
```
This loop iterates through each character in the String *s*. If the current character is `R`, *count* is incremented, if not, *count* is decremented. After incremented or decrementing the value, we check if *count* is equal to `0`. If it is, we increment *amt*.

This is how this loop would flow given the input `"RRLLRLL"`:
1. The first 2 characters are `R`, *count* = 2.
2. The next 2 characters are `L`, *count* = 0.
3. Because *count* = 0, we know we have found a valid substring `"RRLL"`, *amt* = 1.
4. The next character is `R`, *count* = 1.
5. The next character is `L`, *count* = 0.
6. Another valid substring has been found, `"RL"`, *amt* = 2.
7. The next to values are `L`, *count* = 2.
8. Because *count* != 0, we know the last substring `"LL"` is not valid.
9. `"RRLLRLL"` contains 2 valid substrings, `"RRLL"` & `"RL"`.

---
```java
return amt;
```
Lastly, we return *amt*, the total number of valid substrings found.

## Time & Space Complexity
### Time Complexity
This solution has O(n) time complexity. The loop runs *x* times, with *x* being the length of the input string.

### Space Complexity
This solution has O(1) space complexity. We initialized two integers, which both use 4 bytes of space regardless of value.