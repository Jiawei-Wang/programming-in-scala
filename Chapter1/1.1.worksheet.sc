// scala can be concise and one size fits all
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))

// scala can also be adaptive
def factorial(x: BigInt): BigInt = 
    if x == 0 then 1 else x * factorial(x-1)
factorial(30)

