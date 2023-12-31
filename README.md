### Instructions
Exercise from https://exercism.org/tracks/java/exercises/sieve

Your task is to create a program that implements the Sieve of Eratosthenes algorithm to find prime numbers.

A prime number is a number that is only divisible by 1 and itself. For example, 2, 3, 5, 7, 11, and 13 are prime numbers.

The Sieve of Eratosthenes is an ancient algorithm that works by taking a list of numbers and crossing out all the numbers that aren't prime.

A number that is not prime is called a "composite number".

To use the Sieve of Eratosthenes, you first create a list of all the numbers between 2 and your given number. Then you repeat the following steps:

Find the next unmarked number in your list. This is a prime number.
Mark all the multiples of that prime number as composite (not prime).
You keep repeating these steps until you've gone through every number in your list. At the end, all the unmarked numbers are prime.