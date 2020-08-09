package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def inp = "Mam Did You tesT alL Students"
def inpArr = inp.split("\\s+")

inpArr.each {
    it.each {
        innerIt ->
            if (innerIt.matches("[a-z]") && it.find(innerIt.toUpperCase())) {
                print it + " "
            }
    }
}
