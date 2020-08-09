package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def dateFormat = "dd.MM.yyyy"

def date1 = "01.11.2024"
def date2 = "31.10.2019"

if (new Date().parse(dateFormat, date1) > new Date().parse(dateFormat, date2)) {
    println date1 + " is greater"
} else {
    println date2 + " is greater"
}