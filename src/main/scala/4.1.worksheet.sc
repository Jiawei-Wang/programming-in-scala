// class and field
class A:
    var sum = 0

// create an object from class
val a = new A
val b = new A
a.sum
b.sum

// each object has its own fields, called instance variables
// even though a is val, changing field is ok
a.sum = 1
a.sum
b.sum

// but reassigning a to another object is not ok
// a = new A will fail

// private keyword
class B:
    private var sum = 0
val c = new B
// c.sum = 1 will fail, because only class itself can access this field

class C:
    private var sum = 0
    def add(b: Byte): Unit = // parameters are val not vars
        sum += b
    def checksum(): Int = 
        return ~(sum & 0xFF) + 1

// one liner version
class D:
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = ~(sum & 0xFF) + 1

// semicolon
val s = "Hello"; println(s)


// companion class and companion object:
import scala.collection.mutable

class ChecksumAccumulator:
    private var sum = 0
    def add(b: Byte): Unit = 
        sum += b
    def checksum(): Int = 
        return ~(sum & 0xFF) + 1

object ChecksumAccumulator:
    private val cache = mutable.Map.empty[String, Int]
    def calculate(s: String): Int = 
        if cache.contains(s) then
            cache(s)
        else
            val acc = new ChecksumAccumulator // acc is an instance of class ChecksumAccumulator
            for c <- s do
                acc.add((c>>8).toByte)
                acc.add(c.toByte)
            val cs = acc.checksum()
            cache += (s -> cs)
            cs

//call static methods in a companion object
ChecksumAccumulator.calculate("Every value is an object") // no need to create instances

// singleton object: 
// you cannot instantiate a singleton object, therefore you cannot pass parameters to it

// case classes:
case class Person(name: String, age: Int)
val p = Person("Sally", 39) // Person companion object with apply method is created before calling
p.name // class parameters will be stored in fields
p.age
p.toString() // common methods implementation is automatically done
p == Person("Sally", 21)
p == Person("Sally", 39)
p.hashCode == Person("Sally", 39).hashCode

// overwrite default methods:
case class Person2(name: String, age: Int):
    def appendToName(suffix: String): Person2 =
        Person2(s"$name$suffix", age)

object Person2:
    def apply(name: String, age: Int): Person2 = 
        val capitalizedName = 
            if !name.isEmpty then // isEmpty takes no arguments so ok to use either isEmpty() or isEmpty
                val firstChar = name.charAt(0).toUpper
                val restOfName = name.substring(1)
                s"$firstChar$restOfName"
            else throw new IllegalArgumentException("Empty name")
        new Person2(capitalizedName, age)

val q = Person2("sally", 39)
q.appendToName(" Smith")