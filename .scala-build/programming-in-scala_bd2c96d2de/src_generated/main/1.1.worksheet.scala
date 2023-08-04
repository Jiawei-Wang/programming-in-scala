



final class `1$u002E1$u002Eworksheet$_` {
def args = `1$u002E1$u002Eworksheet_sc`.args$
def scriptPath = """1.1.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `1$u002E1$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `1$u002E1$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `1$u002E1$u002Eworksheet_sc`.script as `1$u002E1$u002Eworksheet`

