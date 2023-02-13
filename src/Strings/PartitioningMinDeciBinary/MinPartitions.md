# 1689 - Partitioning Into Minimum Number of Deci-Binary Numbers
## Description
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.

Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.

Example 1:
```text
Input: n = "32"
Output: 3
```

## Pseudocode
1. Initialize a variable to track the highest number seen.
2. Loop through each character in the input String.\
&nbsp; 1. Check if the current number is higher than the current highest\
&nbsp; 2. If so, set the highest variable to the new value
3. Return the highest value found.

## Code Explanation
Let's look into how we find the number of deci-binary needed first.
We know that deci-binary numbers are exclusively made up of 0's and 1's.
Due to the highest possible number in a given value place (tens, hundreds, thousands, etc.)
We know that we can find the number of deci-binary number needed by dividing by 1.
For example, if we had the number 40, our answer would be 4, because 10 + 10 + 10 + 10 = 40.
We essentially need to find which place in the given string has the highest integer value. 
Let's get into the code.
```java
int highest = 0;
```
First, we initialize an integer called *highest*. We will use this variable to keep
track of the highest value we see.

---
```java
for (int i = 0; i < n.length(); i++) {
    if (highest < (n.charAt(i) - '0')) {
        highest = n.charAt(i) - '0';
    }
}

return highest;
```
Here, we loop through each index in the input string, and check if the value of the current
number is higher than that of the previous highest. If it is, we reassign the highest variable
to the current number. After looping through all the numbers, we return the highest value found.

Initially, this code looks strange because we are subtracting a char from a char, but assigning it to an integer.
This works due to something called [Type Casting](https://www.w3schools.com/java/java_type_casting.asp).
When we subtract the char from the char, the chars are converted to their [ASCII](https://www.w3schools.com/java/java_type_casting.asp) values.
For example, the character *'4'* has an ASCII value of 52, the character *'2'* has an ASCII value of 50.
So when we subtract *'2'* from *'4'*, we are really subtracting 50 from 52.

## Time & Space Complexity
### Time Complexity
This solution has O(n) time complexity. We run the for loop *i* times, with *i*
being the length of the input string. If the input string was 5 characters long,
we would run the for loop 5 times. If it was 10 characters long, we would run
the for loop 10 times.

### Space Complexity
This solution has O(1) space complexity. We only initialize one variable, an integer, which
uses 4 bytes of space regardless of the value.