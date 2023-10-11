# Pyramid Descent Puzzle Solver

A Java-based solution to solve the Pyramid Descent Puzzle. The puzzle consists of a pyramid of positive integers. The goal is to find a path that traverses the pyramid from top to bottom, visiting numbers whose product is a given target value.

## Problem Statement

Given a pyramid of positive integers, find a path that traverses the pyramid from top to bottom visiting numbers whose product is a given target value. Each step in the path must go down one row, and go either one step to the left or one step to the right.

For example, consider the following pyramid with a target value of 2:

    `1`

    `2 3`

    `4 1 1`

The solution for this puzzle is `LR`, indicating that the correct path starts from the `1` on top, goes `Left` to the `2` on the second row, then goes `Right` to the `1` in the center of the bottom row.

## Solution Approach

The solution is implemented using an iterative breadth-first search approach with a queue. Each element in the queue represents a state, which includes the current row, column, product, and the path taken to reach that state.

## Usage

1. Clone the repository.
2. Navigate to the directory containing the Java files.
3. Compile and run the `PyramidDescentSolver` class.

```bash
javac PyramidDescentSolver.java
java PyramidDescentSolver
```

## Solution

For the provided sample the solution will be:

LRLL

## Files

Input provided as `pyramid_sample_input.txt`

Output provided as `pyramid_sample_output.txt`
