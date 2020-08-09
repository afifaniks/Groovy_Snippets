package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def emailRegex = /^[A-Za-z0-9\.]+@[A-Za-z\.]*\.[A-Za-z]+$/
def emails = ["x@x.com", "x@x", "x@x.com.bd.gov", "x.x@x.com out", "x@x.com", "\"x@\"x.com"]

emails.each {
    if (it.matches(emailRegex))
        println(it + " valid")
    else
        println(it + " invalid")
}