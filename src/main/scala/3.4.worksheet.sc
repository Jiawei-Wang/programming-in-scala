// use map instead of for-each to reduce side effects
val adjectives = List("One", "Two", "Red", "Blue")
val nouns = adjectives.map(adj => adj + " Fish")

// same when using for-yield
val nouns2 = 
    for adj <- adjectives yield
        adj + " Fish"

// these two produce same results, because compile turns for-yield into a map

// return type of map/for-yield depends on return type of the inner function
val lengths = nouns.map(noun => noun.length)
val lengths2 = 
    for noun <- nouns yield 
        noun.length


// Option, Some, None
val ques = Vector("Who", "What", "When", "Where", "Why")
val startsW = ques.find(q => q.startsWith("W"))
val hasLen4 = ques.find(q => q.length == 4)
val startsH = ques.find(q => q.startsWith(("H")))

// Option has a map method
startsW.map(word => word.toUpperCase())
startsH.map(word => word.toUpperCase())