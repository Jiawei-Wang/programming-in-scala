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

// a different way to create tuple
val anotherPair : Tuple2[Int, String] = (99, "shoes")

// immutable set by default
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear" // returns a new immutable set, same as JetSet = jetSet + "Lear"
val query = jetSet.contains("Cessna")

// mutable set by import
import scala.collection.mutable
val movieSet = mutable.Set("Spotlight", "Moonlight")
movieSet += "Parasite" // there is a defined += method in mutable.Set

// immutable map example
val RomanNumeral = Map(
    1 -> "I", 2 -> "II"
)
val one = RomanNumeral(1)

// mutable map example
import scala.collection.mutable
val treasureMap = mutable.Map.empty[Int, String]
treasureMap += (1 -> "Go to island")
treasureMap += (2 -> "Find big x on ground")
treasureMap += (3 -> "Dig")
val step2 = treasureMap(2)

