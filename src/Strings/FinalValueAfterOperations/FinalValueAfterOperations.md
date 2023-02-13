# 2011 - Final Value of Variable After Performing Operations
## Description
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

## Pseudocode
1. Initialize a variable to store the current count.
2. Loop through each index in the input array.\
&nbsp; 1. Check if the 2nd character of the current index == '-'.\
&nbsp; 2. If it is, decrement the counter.\
&nbsp; 3. Else, increment the counter.
3. Return the value of the counter.

## Code Explanation
```java
int counter = 0;
```
First, we initialize a counter with the value of 0. This counter will be incremented and decremented as we loop through the inputs.

---
```java
for (String op : operations) {
    if (op.charAt(1) == '-') {
        counter--;
    } else {
        counter++;
    }
}

return counter;
```
This [enhanced for loop](https://www.w3schools.blog/enhanced-for-loop-java) Iterates through each operator (op) in the
input array. The description shows that there are 4 possible inputs:
- X++
- ++X
- X--
- --X

In all 4 inputs, the middle character is always '+' or '-', because of this, we can simply check the middle character (index 1)
To see if the operation should increment or decrement the counter. After finishing the for loop, we simply return the counter.

## Time & Space Complexity
### Time Complexity
This solution has O(n) time complexity. The loop runs *x* number of times, with *x* being the length of the input array.
If the input has 5 operators, the loop with run 5 times. If there are 10 operators, it will run 10 times.

### Space Complexity
This solution has O(1) time complexity. The integer *counter* uses a constant amount of space (4 bytes) regardless of its value.