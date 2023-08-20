// loop with while, not a good approach in scala
// @main def m(args: String*) = {
    // var i = 0 // auto type inference
    // while i < args.length do {
        // println(args(i))
        // i += 1 // no i++ or ++i in scala
    // }
// }

// if statement, this example shows parentheses, curly braces and semicolons are optional
// @main def m(args: String*) = 
    // var i = 0
    // while i < args.length do 
        // if i != 0 then print(" ") // print a space after every input, nothing before the first input
        // print(args(i)) // no new line
        // i += 1
    // println("\nfinish")

// iterate with foreach and for-do, a more functional style than imperative 
// @main def m(args: String*) =
    // args.foreach((arg: String) => println(arg)) 
    // 1. function literal (lambda expression)
    // 2. if type is mentioned, argument portion needs to be within parentheses

// syntax of a function literal: parameters => function body
// (x: Int, y: Int) => x + y

// if a function literal has one statement that takes one argument, it can be shortened as
// @main def m(args: String*) = args.foreach(println)

// what if I want to use loops
@main def m(args: String*) =
    for arg <- args do // read as "for arg in args do", and arg is always val 
        println(arg)