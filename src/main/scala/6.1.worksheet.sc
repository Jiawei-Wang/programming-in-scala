// class can use class parameters in class body directly without constructor
class Rational1(n: Int, d: Int): 
    println("rational number is: " + n + "/" + d)
val a = new Rational1(1,2)
val b = Rational1(1,2) // new keyword is optional

// toString does not give meaningful output, so override it
class Rational2(n: Int, d: Int):
    override def toString = s"$n/$d"
val c = Rational2(1,3)

// add precondition to inputs

class Rational3(n: Int, d: Int):
    require(d != 0)
    override def toString = s"$n/$d"
// val d = Rational3(1,0) throws exception





