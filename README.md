# Homework #1 - Lexi using Composite and Strategy Patterns

* Author: Isaac Hager
* Class: CS472 Section #001
* Semester: Spring 2026

## Overview

Lexi is a simple WYSIWYG lexical editor that supports text as characters 
and rectangles formatted in rows and columns.

## Reflection

I enjoyed trying to play to the strengths of the design patterns involved. 
There were several times when I had to add functionality or fix something,
and I had to make a decision on what class it should go in or how i might
implement it. The actual coding was a very small part of this project. When
I did have to add things that I was missing, like composeRoot(), it was very
simple because of the structure that I was working with. I liked the Strategy
pattern because it's simple to design and I can already see the benefit of
how easy it will be to add new Compositor strategies.

Wow, it really is easy to add functionality to a program that was designed
with patterns. It was a very unintrusive addition. The only changes I made
to other classes were optimization changes unrelated to Decorator. I was
able to do the implementation very quickly. The only part that I really had
to work through and think about was how to add padding in the compose() method.
I may very well end up changing the implementation after recieving review, as
I'm not sure if it's a good implementation.

## Compiling and Using

Navigate to the root directory containing Lexi and all of its dependencies.
Compile source files with the command:

`
$ javac Lexi.java
`

Then run the program with the command:

`
$ java Lexi
`

and the Lexi window should open.


## Sources used

Composite(163) pattern
Strategy(315) pattern
Decorator(175) pattern