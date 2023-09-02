// formatArgs4 in 3.3 is easy to test
class ArgsFormatter {
  def formatArgs4(args: List[String]): String = args.mkString("\n")
}

import org.scalatest.funsuite.AnyFunSuite

class TestFormatArgs extends AnyFunSuite {
  test("formatArgs4 should return a string with elements separated by newline") {
    val formatter = new ArgsFormatter()
    val inputList = List("zero", "one")
    val result = formatter.formatArgs4(inputList)
    assert(result == "zero\none")
  }

  test("formatArgs4 should handle an empty list") {
    val formatter = new ArgsFormatter()
    val inputList = List.empty[String]
    val result = formatter.formatArgs4(inputList)
    assert(result == "")
  }
}


