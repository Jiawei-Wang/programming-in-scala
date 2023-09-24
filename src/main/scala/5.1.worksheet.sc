// operators are methods
// infix: arithmetic methods are the most common ones
7 + 5
7.+(5)

// prefix: only four of them +, -, !, ~ 
-2.0
(2.0).unary_-
val pos = 5
val neg = -pos
val a = true
val b = !a
val c = a.unary_!

// postfix: methods that take no arguments when invoked without dot or parentheses
7.toLong
"Hello".toLowerCase
import scala.language.postfixOps
"Hello" toLowerCase

// relational operations: >, <, >=, <=, !, return boolean
1 > 2
!true

// logical operations: &&, ||, take boolean operands in infix notation and return boolean result
val toBe = true
val question = toBe || !toBe

// bitwise operations: &, |, ^, ~, <<, >>, >>>
1 & 2
1 | 2
1 ^ 2
~1

// compare: ==, !=, only care about content
("he" + "llo") == "hello"
("he" + "llo") equals "hello"

// assignment operator:
var x = 3
val y = 2
x *= y + 1
x