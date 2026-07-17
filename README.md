#Longest Common Prefix
Problem Description
Write a method that finds the longest prefix (starting characters) that is shared by all strings in an array.

A prefix is a sequence of characters that appears at the beginning of a string. For example, "flo" is a prefix of "flower".

Requirements
Find the longest sequence of characters that appears at the start of every string in the array
All strings must share this prefix for it to be valid
If no common prefix exists, return an empty string ""

Example 1:


Input: strs = ["flower", "flow", "flight"] 
Output: "fl"

Explanation: 
- "flower" starts with "fl"
- "flow" starts with "fl"  
- "flight" starts with "fl"
- "fl" is the longest prefix all three strings share
- 
Example 2:
  
Input: strs = ["dog", "racecar", "car"]
Output: ""

Explanation: 
- These strings share no common starting characters
- Therefore, return an empty string
