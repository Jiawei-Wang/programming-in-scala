// example to show functions are first class values in scala
import org.scalatest.concurrent.Eventually
import org.scalatest.time.{Span, Seconds}
import org.scalatest.matchers.should.Matchers
import org.scalatest.funsuite.AnyFunSuite

class SimpleExampleSpec extends AnyFunSuite with Eventually with Matchers {
  val xs = 1 to 3
  val it = xs.iterator

  test("Testing iterator with eventually") {
    eventually(timeout(Span(5, Seconds)), interval(Span(1, Seconds))) {
      it.next() should be (3)
    }
  }
}
