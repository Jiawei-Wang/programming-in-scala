// go through list in oop way
def printArgs(args: List[String]): Unit = 
    var i = 0
    while i < args.length do
        println(args(i))
        i += 1

// functional way
def printArgs2(args: List[String]): Unit = 
    for arg <- args do
        println(arg)

// functional way 2
def printArgs3(args: List[String]): Unit =
    args.foreach(println)

// functional and zero side effect
def formatArgs4(args: List[String]) =
    args.mkString("\n")
println(formatArgs4(List("a", "b", "c")))

