# Dynamic Programming
Dynamic Programming is a technique used to solve complex problems by breaking them down into simpler subproblems.

## Basic Concept
1. Decompose into subproblems.
2. Memoization : store the results of subproblems to avoid recalculating them.
3. Build the solution : use the results of the subproblems to build the solution to the main problems

## Objectives of dynamic programming (DP):
- Avoid duplicate work
- Reduce redundant computations
- Optimize solutions
- Improve time efficiency
- Solve complex problems

## Prerequisites on the shortest paths
( if you don't have any idea, don't worry, we will walk through it pretty slowly together 😊😉)
- Bellman-Ford algorithm
- Structure of an optimal solution
- case of graphs without cycles

## Examples
### 1. The Staircase Problem
- imagine you need to climb a staircase with 'n' steps
- and you can either take 1 step or 2 steps at a time.
- the problem is to find the number of different ways to climb the staircase

#### Decomposition into Subproblems
if you are at step 'n' ,  you have two options:
- you reached step 'n' from 'n-1'
- you reached step 'n' from 'n-2'

-> the total number of ways to reach step 'n' is the sum of the ways to reach 'n-1' and step 'n-2'

#### Memoization
we will use an array to store the number of ways to reach each step


### 2. Kadane's Algorithm
- Kadane's Algorithm is used to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers, which can include both positive and negative numbers.
- Kadane's Algorithm is a classic example of dynamic programming, because it solves a problem by breaking it down into simpler subproblems and storing the results of these subproblems to avoid redundant calcultaions

  #### Define the subproblems
  - Subproblem : find the maximum sum of a subarray ending at each index 'i'.
  - ```max_current[i]``` : the maximum sum of the subarray ending at index 'i'.
 
  #### Recurrence relation
  - ``` max_current[i] = max( nums[i], max_current[i-1]+nums[i] ); ```
 
  #### The base case
  ``` max_current[0]=nums[0]; ```

  #### Solve the subproblems iteratively
  - Loop through the array from the second element to the end
  - Update ``` max_current ``` and keep track of overall maximum ( ```max_global``` )
 
  #### Use the solution of subproblems to solve the original problem
  The final value of ``` max_global ``` is the maximum sum of any subarray


### 3. Fibonacci sequence
- The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
- It starts with 0 and 1
- Here's how the sequence looks: 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 ...
- Here's the formula for the Fibonacci sequence : ``` F(n) = F(n-1) + F(n-2) ``` where ```F(0)=0``` and ``` F(1)=1```.

##### What if you use recursion !?
  - **time complexity** : O(2<sup>n</sup>)
  - **space complexity** : O(n)
