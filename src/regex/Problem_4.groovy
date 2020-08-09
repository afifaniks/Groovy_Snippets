package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def timeRegex = /^(1?[0-2]|0[1-9])\.[0-5][0-9]\.[0-5][0-9]$/
def times = ["12.59.59", "12.60.59"]

times.each {
    if (it.matches(timeRegex)) {
        println(it + " : valid")
    } else {
        println(it + " : invalid")
    }
}