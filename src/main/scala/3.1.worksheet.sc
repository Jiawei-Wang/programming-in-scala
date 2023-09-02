// instantiate objects or class instances using new

// parameterize an instance with values by passing objects to a constructor in parentheses
import java.math.BigInteger
val big = new java.math.BigInteger("12345")

// parameterize an instance with types by specifying one or more types in square brackets
val greetStrings = new Array[String](2) // [type](value)
greetStrings(0) = "Hello"
greetStrings(1) = "World" // equal to greetStrings.apply(1)

// a more explicit way
val greetStrings2: Array[String] = new Array[String](3)
// notice that type is needed, value is not

for i <- 0 to 1 do 
    println(greetStrings(i))

// 0 to 1 is equal to 0.to(1), another example: 1 + 2 is equal to 1.+(2)
// 0 to 1 is [0, 1] not [0, 1)

// greetStrings(i) is equal to greetStrings.apply(i)
// any application of an object to some arguments in parentheses will be transformed to an apply method call

// greetString(1) = "Hi" is equal to greetStrings.update(0, "Hi")

// so this is equal to the above example
val greetStrings3: Array[String] = new Array[String](2)
greetStrings3.update(0, "hello")
greetStrings3.update(1, "world")
for i <- 0 to 1 do
    println(greetStrings3.apply(i))
