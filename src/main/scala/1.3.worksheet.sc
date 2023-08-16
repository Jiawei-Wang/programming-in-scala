// scala is concise

// java version
// class MyClass {
//     private int index;
//     private String name;
//     public MyClass(int index, String name) {
//         this.index = index;
//         this.name = name;
//     }
// }

// scala version
class MyClass(index: Int, name: String)


// scala is high level

// java version
// boolean nameHasUpperCase = false;
// for (int i = 0; i < name.length(); ++i) {
//     if (Character.isUpperCase(name.charAt(i))) {
//         nameHasUpperCase = true;
//         break;
//     }
// }

//scala version
val name: String = "abCdef"
val nameHasUpperCase = name.exists(_.isUpper)

// more on Scala predicates: https://stackoverflow.com/questions/40009857/scala-predicates

// of course newer java version also supports Lambda
// boolean nameHasUpperCase =
//     name.chars().anyMatch(
//         (int ch) -> Character.isUpperCase((char) ch)
//     );


// scala type inference system allows omitting some type information
import scala.collection.mutable.HashMap
val x = new HashMap[Int, String]() // no need to say what type is x

