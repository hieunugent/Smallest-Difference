# Smallest-Difference
- Write a function that takes in two non-empty array of intergers, finds the pair of numbers (one form each array)whose absolute difference is cloest to zero
- Return the array containing these two numbers., 
- With the number from the first array in the first position
# Solution
- sort two input array.
- declare int array to hold result
- iterate first array as outer loop 
- iterate second array as inner loop
- declare currentMin is max value use to compare with the first abs different
- difference element in first array with all the second array stop when the diffent is larger then current, continue otherwise
- if the different is smaller then current min add 2 num to the result
- if the current min is zero return the current result
- continue with other num in first array

