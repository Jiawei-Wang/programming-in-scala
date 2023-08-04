import scala.collection.Set
import org.scalatest.funsuite.AnyFunSuite

// scala can be concise and one size fits all
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))

// scala can also be adaptive
def factorial(x: BigInt): BigInt = 
    if x == 0 then 1 else x * factorial(x-1)
factorial(30)

// scala also lets you add new control structures that can be used as conveniently as built-in types
class SetSpec extends AnyFunSuite:
    test("An empty Set should have size 0") {
        assert(Set.empty.size == 0)
    }
    test("Invoking head on an empty Set should fail") {
        assetThrows[NoSuchElementException] {
            Set.empty.head
        }
    }
