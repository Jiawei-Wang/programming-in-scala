// scala also lets you add new control structures that can be used as conveniently as built-in types
import scala.collection.Set
import org.scalatest.funsuite.AnyFunSuite

class SetSpec extends AnyFunSuite {
    test("An empty Set should have size 0") {
        assert(Set.empty.size == 0)
    }
    test("Invoking head on an empty Set should fail") {
        assertThrows[NoSuchElementException] {
            Set.empty.head
        }
    }
}