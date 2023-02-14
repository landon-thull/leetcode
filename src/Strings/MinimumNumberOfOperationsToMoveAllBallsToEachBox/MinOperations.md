# 1769 - Minimum Number of Operations to Move All Balls to Each Box
## Description
You have n boxes. You are given a binary string boxes of length n, where boxes[i] is `0` if the ith box is empty, and `1` if it contains one ball.

In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.

Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.

Each answer[i] is calculated considering the initial state of the boxes.

Example 1:
```java
Input: boxes = "110"
Output: [1, 1, 3]
```

Example 2:
```java
Input: boxes = "001011"
Output: [11, 8, 5, 4, 3, 4]
```

## Pseudocode
1. Initiate an array for the output.
2. Initiate a list to store indexes of `1` found in the string.
3. Iterate through each character in the String *boxes*. \
&emsp; 1. Evaluate if the current character == '1'. \
&emsp; 2. If so, add the current index to the list of indexes.
4. Iterate through each character in the String *boxes*. \
&emsp; 1. Initialize a counter. \
&emsp; 2. Iterate through each index stored in the list of indexes. \
&emsp;&emsp; 1. Add the distance between the index and the current character to the counter. \
&emsp; 3. Append the counter to the output array.
5. Return the output array.

## Code Explanation
```java
int[] out = new int[boxes.length()];
ArrayList<Integer> indexes = new ArrayList<>();
```
First, we instantiate two things, an array *out*, and an ArrayList *indexes*. The *out* array will store our return values,
and the ArrayList will store the indexes where the character `1` is found.

---
```java
for (int i = 0; i < boxes.length(); i++) {
    if (boxes.charAt(i) == '1') {
        indexes.add(i);    
    }
}
```
This loop iterates through each character in the String *boxes* and checks if the character is `1`. If it is, the index it was
found at is added to the *indexes* list. This list will be used to find the distance between each index of `1`, and the index
they need to be relocated to.

---
```java
for (int i = 0; i < boxes.length(); i++) {
    int tempTotal = 0;
    
    for (int index : indexes) {
        tempTotal += Math.abs(index - 1);    
    }
    
    out[i] = tempTotal;
}
```
This for loop is used to calculate the required number of moves to get every `1` to the current index. *tempTotal* is used to 
keep track of the total distance for the current iteration. The inner loop iterates through each index in the *indexes* list.
It then calculates the distance between `1` and the target index. `Math.abs` is used here to make sure only addition is performed.
If `Math.abs` was not used, any `1` to the right of the target index would be subtracted from *tempTotal* instead of added.
After finishing the inner loop, tempTotal is added to the *out* array at the current index `i`.

---
```java
return out;
```
Finally, we return the array `out`.
## Time & Space Complexity
### Time Complexity
This solution has O(n) time complexity. The total number of loop iterations is dictated by the length of the String *boxes*. 
### Space Complexity
This solution has O(n) space complexity. The array *out* is the same length as the input String *boxes*, and the list *indexes* will always be shorter than the input. All the integers in the equation use a fixed amount of space.