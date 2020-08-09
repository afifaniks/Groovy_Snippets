package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def str = "abad acdd adabdd"

str.split().each {
    if (!it.matches(".*ab.*"))    println it
}