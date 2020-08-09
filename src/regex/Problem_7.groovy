package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def dateMonthRe = /(0?[1-9]|[12][0-9]|3[01])\/(0?[1-9]|1[0-2])/
def dates = ["2/29", "1/30", "30/1", "29/12"]

dates.each {
    if (it.matches(dateMonthRe)) {
        println(it + " : valid")
    } else {
        println(it + " : invalid")
    }
}