# 1920 - Build Array from Permutation

## Description
Given a zero-based permutation `nums` (0-indexed), build an array `ans` of the same length where `ans[i] = nums[nums[i]]` for each `0 <= i < nums.length` and return it.

A zero-based permutation `nums` is an array of distinct integers from 0 to `nums.length - 1` (inclusive).

## Pseudocode
1. Initiate an array for the output.
2. Iterate through each character in the `nums` array. \
&nbsp; 1. Get the value at the current index from the `nums` array. \
&nbsp; 2. Get the value at the index just pulled from the `nums` array. \
&nbsp; 3. Assign that value to the current index of the output array. \
3. Return the output array. 

## Code Explanation
```java
int[] out = new int[nums.length];
```
Here, we initiate an empty array the same length as the input array. This array will be returned at the end of the function. We know it will be the same length as the output array because we are simply reordering the array.

---
```java
for (int i = 0; i < nums.length; i++) {
    out[i] = nums[nums[i]];    
}
```
Here, we iterate through each value in the array `nums`. We pull the value at the current index `i` from the input array, and then pull that value from the same array and assign it to the current index of the output array. For example, given the input array `[1, 2, 3, 4]`, we would pull the value at index `0`, which is `1`, then pull the value at index `1` from the same array, which returns `2`.

---
```java
return out;
```
After iterating through all the indexes, we simply return the `out` array.

## Time & Space Complexity
### Time Complexity
This function has O(n) time complexity. If the input array has a length of 5, the for loop will run 5 times.

### Space Complexity
This function has O(n) space complexity. The `out` array is always the same length as the `nums` array. If the input array has a length of 5, the `out` array will have a length of 5. 