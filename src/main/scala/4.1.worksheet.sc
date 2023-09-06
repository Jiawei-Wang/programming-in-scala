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
    def add(b: Byte): Unit = 
        sum += b
    def checksum(): Int = 
        return ~(sum & 0xFF) + 1




