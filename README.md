# java-fundamentals

### lab 01
*Description*

Java fundamentals practice: built-in primitive values (ints, floats, doubles, Strings, booleans), for loops, while loops, if statements, functions, parameters and return statements

*Methods*

pluralize accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one

flipNHeads accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row

clock uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes

### lab 02
*Description*

This lab is dedicated to creating, interacting with and manipulating arrays in Java. Arrays in Java have a fixed size. Arrays are created with a certain size and they never shrink or grow. Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.

*Methods*

The roll method accepts an integer n and rolls a six-sided dice n times. The method returns an array containing the values of the rolls.

The containsDuplicates method returns true or false depending on whether an array contains duplicate values.

The average method accepts an array of integers and calculates and returns the average of all the values in the array.

Given an array of arrays the lowestAverage method calculates the average value for each array and returns the array with the lowest average.
