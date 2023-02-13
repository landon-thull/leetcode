# 771 - Jewels and Stones
## Description
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case-sensitive, so "a" is considered a different type of stone from "A".

## Pseudocode
1. Initialize a list for indexing jewels.
2. Initialize a counter to track number of matches.
3. Loop through the jewels String.\
&nbsp; Add the current character to the list.
4. Loop through the stones String.\
&nbsp; Increment counter if the current character is in the list.
5. Return the counter.

## Code Explanation
```java
HashSet<Character> jewelList = new HashSet<>();
int counter = 0;
```
First, we initialize two things, a [HashSet](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html), and an integer. We use a HashSet because it can be searched much faster, and it can't hold duplicate values. The HashSet will be used to keep track of the characters seen in the jewels array.

---
```java
for (int i = 0; i < jewels.length(); i++) {
    jewelList.add(jewels.charAt(i));
}
```
This for-loop adds each character in the jewels String to the jewelList array. We will not end up with duplicate values, as HashSets cannot contain duplicates.

---
```java
for (int i = 0; i < stones.length(); i++) {
    if (jewelList.contains(stones.charAt(i))) {
        counter++;
    }
}

return counter;
```
Here, we loop through the *stones* String, and check if our HashSet *jewelList* contains the current character. If so, the counter is incremented by 1. After the for-loop is finished, we simply return *counter*.

### Time Complexity
This solution has O(n) time complexity. The total number of loop iterations will be equal to the length of the jewels array + the length of the stones array.
### Space Complexity
This solution has O(n) space complexity. We declared a HashSet and an integer. The integer will use 4 bytes regardless of values, and the HashSet will grow with the number of unique values in the String *jewels*.