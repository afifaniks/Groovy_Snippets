/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 7/30/20
 * Web: https://afifaniks.me
 */

// Print Statement
println("Hello, Groovy!")

// Class Instantiation
Adder adder = new Adder(2, 3)
Adder adder1 = new Adder("Me", "You")
println(adder.add())
println(adder1.add())

// Ranges
def ranges = 1..20
println(ranges.find {println(it)})