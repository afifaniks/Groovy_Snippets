/**
 * Project: Groovy_Practice
 * This file contains basic groovy exercises
 * Author: AFIF AL MAMUN
 * Created in 8/5/20
 * Web: https://afifaniks.me
 */


// Find() method for list
def list = [1, 2, 3, 4, 5, 9]

def findFour = list.find {num -> num == 4}
println(findFour)

def even = list.findAll {it % 2 == 0}
println(even)


// Find in Map
def map = [1:"Naruto", 2:"Sasuke", 3:"Hashirama", 4:"Itachi", 5:"No Sakura"]

def findNoSakura = map.find { it.key == 5 }.value
println(findNoSakura)

// Any x Every
list = (0..25)

println(list.any{it > 15})
println(list.every{it > -1})

// FindResult
def names = ["Spike", "Faye", "Edward", "Vicious"]
def findSomeone = names.findResult { if (it.startsWith("F")) it }

println(findSomeone)

// Collect
def values = (10..20)
def squareIt = values.collect { it * it }

println(squareIt)

// Collect from multiple list
def regions = ["Asgard", "Middle Earth"]
def cities = ["Dhaka", "Ctg", "Wherever", "Nowhere"]

def newList = cities.collect(regions, { it.toUpperCase() })

println(newList)

// Each
values = (50..40)
values.each { print it + " " }
println()

// Each with index
values.eachWithIndex { int entry, int i -> println "Index " + i + ": " + entry }

// Conversion
Set citySet = cities.toSet()
println(citySet)
println(citySet.toListString())
println(citySet.toSpreadMap())

// Sort
def sortedCity = cities.sort()
println(sortedCity)

// Group By
names = ["Cat woman", "Black widow", "Wonder woman"]
def grouped = names.groupBy { it.contains("wo") }
println(grouped)
// Printing true values only
println(grouped.find {it.key == true}.value)

// Intersect
def setA = [1, 2, 3, 4, 5]
def setB = [4, 5, 6, 7, 8]

println(setA.intersect(setB))

// Add & Remove
def initList = ["Iron Maiden", "Pink Floyd", "Tom Day"]
initList.addAll(["Vancouver Sleep Clinic", "Radiohead", "Ashes"])

println(initList)

initList.removeAll(["Ashes"])
println(initList)

// String Indexing
def foo = "String"
println(foo[-1]) // Last Character
println(foo[2..-1])

// Multiline Strings
def bar = """
How many roads must a
man walks down
"""
println(bar)

// Tokenize
def str = "Tokenize this string, NOW!"
println str.tokenize()
println str.split()

// String Operations
def str2 = "Add me"
println str2*3
println str2 + " now"

// String methods
def fooBar = "Shine on you crazy diamond"
fooBar.each {
    if (it == 'd')
        println("d found")
}

def animals = [:]
animals["key1"] = "Doggo"
animals["key2"] = "Puppy"
animals["key3"] = "Dog"

println animals
animals.each {
    println it
}

// Regex
def regex = ~"Regex"
println "Regox".matches(regex)

def ipRegex = ~"[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}"
def ip = "127.0.0.1234"
println ip.matches(ipRegex)

