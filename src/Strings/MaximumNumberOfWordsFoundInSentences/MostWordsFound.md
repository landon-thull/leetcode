# 2114 - Maximum Number of Words Found in Sentences
## Description
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

## Pseudocode
1. Initialize a counter.
2. Loop through the array of sentences. \
&emsp; 1. Initialize a temporary counter to keep track of the number of spaces. \
&emsp; 2. Loop through the current sentence. \
&emsp; &nbsp; 1. If the current character == ' ' increment the temporary counter. \
&emsp; 3. If the temporary counter's value is higher than the primary counter, assign the temporary counter's value to the primary counter. \
3. return the primary counter

## Code Explanation
```java
int count = 1;
```
First we initialize our primary counter. This counter will keep track of the highest number of words found and will be returned at the end of the function. The counter is given a value of 1 because the constraints of the problem require at least 1 word.

---
```java
for (String sentence : sentences) {
    int temp = 0;
    for (int i = 0; i < sentence.length(); i++) {
        if (sentence.charAt(i) == ' '){
        temp++;
        }        
        count = Math.max((temp + 1), count);
    }
}
```
Here, we have two for loops. The outer loop moves through each sentence within the array. After that, we initialize a temporary counter to keep track of the number of spaces in the current sentence. Next, we enter the inner loop, which iterates through each character in the current sentence. Everytime a space is found, the temporary counter is incremented by one. After looping through the sentence. After exiting the inner for loop, if the temporary counter is greater than the primary counter, we assign the value of the temporary counter to the primary counter. 

---
```java
return count;
```
After exiting both for loops, we return the primary counter.
## Time & Space Complexity
### Time Complexity
This solution has O(M*N) time complexity, with M being the number of sentences, and N being the average number of characters in each sentence.
### Space Complexity
This solution has O(1) space complexity. Two integers are initialized, each integer uses 4 bytes regardless of value.