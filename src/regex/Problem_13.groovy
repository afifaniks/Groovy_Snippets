package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def str = "abba abbab baba"

str.split().each {
    if (it.findAll("b").size() == 3) println it
}