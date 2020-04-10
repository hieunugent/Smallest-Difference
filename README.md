# Smallest-Difference
- Write a function that takes in two non-empty array of integers, finds the pair of numbers (one form each array)whose absolute difference is closest to zero
- Return the array containing these two numbers.,
- With the number from the first array in the first position
# Solution
- sort two input array.
- declare int array to hold result
- iterate first array as outer loop
- iterate second array as inner loop
- declare currentMin is max value use to compare with the first abs different
- declare there minResult to hold the current result of 2 array
- process as condition of if first num is greater than second num using first num to diff second num , otherwise
- if two num is equal return the array of two num
- if currentDiff is less than the minDiff than replace the minDiff  
- continue util this will out of bound for any array
