package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def inp = "all ala imi"
inp = inp.split("\\s+")

inp.each {
    if (it[0] == it[-1])
        println it
}