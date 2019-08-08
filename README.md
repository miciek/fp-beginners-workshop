# Functional Programming beginners workshop

If you have ever found yourself late at night debugging some impossible bug that "shouldn't have happened", only to find out that it was all about some obscure global state change, come join us and see what FP has to offer.

During this workshop, you will learn how to deal with your worst enemies: shared mutable state and code you can't trust. You will do a set of exercises that focus on dealing with these problems using Java whenever possible and Scala in more advanced cases. You will learn the two fundamental tools of functional programming: pure functions and immutable values.

This event is open for all programmers that know the basics of OOP in Java. Scala knowledge is not required. We will introduce & use only the very basic syntax constructs.

## Agenda
1. What is a function? [code](src/main/java/Intro.java)
1. Exercise: Imperative vs Declarative [code](src/main/java/Intro.java)
1. Functions in Scala (`def`, return type, last expression, REPL) [code](src/main/scala/IntroScala.scala)
1. Exercise: Functions in Scala [code](src/main/scala/IntroScala.scala)
1. Coding imperatively (live coding) [code](src/main/java/ShoppingCartDiscounts.java)
1. Pure function: imperative vs functional
1. Exercise: Refactoring to a pure function [code](src/main/java/TipCalculation.java)
1. The Pure Function
1. Exercise: Pure or impure?
1. Using Scala to write pure functions (live coding) [code](src/main/scala/ShoppingCartDiscountsScala.scala)
1. Exercise: pure functions in Scala [code](src/main/scala/TipCalculationScala.scala)
1. Testing pure functions [code](src/main/scala/TipCalculationScala.scala)
1. Exercise: Testing pure functions [code](src/main/scala/TestingPureFunctions.scala)
1. Exercise: Getting burnt by mutability [code](src/main/java/LapTimes.java)
1. Mutability is dangerous (`Itinerary` live coding)
1. Shared mutable state
1. Dealing with the moving parts (OOP `Itinerary` live coding)
1. Building our intuitions about immutability
1. Exercise: Immutable `String` API
1. Purely functional approach to the shared mutable state (FP `Itinerary` live coding)
1. Exercise: Practicing immutable slicing and appending
1. Exercise: Purely functional approach to the shared mutable state (FP `LapTimes`)
