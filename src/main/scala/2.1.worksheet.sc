// type `Int` is `Int` class in package `scala`, which is from java's `int` values
// `scala` package contains core libraries and classes that are automatically available without explicit import statements
import scala.Int
val x: scala.Int = 5


// type
val msg1 = "Hello World"
val msg2: java.lang.String = "Hello World"
val msg3: String = "Hello World"

// define a function
def max(x: Int, y: Int): Int = {
    if x > y then x else y
}
max(5, 3)
val bigger = max(3,5)

// one-liner for function with only one statement
def min(x: Int, y: Int): Int = if x < y then x else y

// a function with no input or output
def greet() = println("hello")
