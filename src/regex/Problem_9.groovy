package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def str = "abcd12XY15c1552d13"
def numberArray = str.replaceAll("[A-Za-z]+", " ").trim().split("\\s+")

numberArray.each {
    if (it.toInteger() % 2 != 0)
        println it
}
