// better way to initialize an array
val numNames = Array("zero", "one", "two")
// as discussed before this is equal to 
val numNames2 = Array.apply("zero", "one", "two")
// this is done by using apply in a companion object

// List is immutable
val oneTwoThree = List(1,2,3) 
// once again, it is List.apply() from companion object so no "new List" is needed
val Four = List(4)
val longList = oneTwoThree ::: Four
val longerList = 0 :: longList  // right operand, same as longList.::(0)

// simple way to initialize a new list
val simpleList = 1 :: 2 :: 3 :: Nil
// :: method is defined on class List so the last element has to be Nil

// tuple can hold different types of values
val pair = (99, "shoes")
val num = pair(0)

val anotherPair : Tuple2[Int, String] = (99, "shoes")
