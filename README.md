# Dynamic Programming
Dynamic Programming is a technique used to solve complex problems by breaking them down into simpler subproblems.

## Basic Concept
1. Decompose into subproblems.
2. Memoization : store the results of subproblems to avoid recalculating them.
3. Build the solution : use the results of the subproblems to build the solution to the main problems

## Examples
### The Staircase Problem
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

