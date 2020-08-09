package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def dateRegex = /^(3[01]|0?[1-9]|[12][1-9])\/(0?[1-9]|1[0-2])\/([01][0-9]{3}|20[01][0-4])$/
def dates = ["12/12/1212","12/13/1212","12/12/12122","32/12/1212"]

dates.each {
    if (it.matches(dateRegex)) {
        println(it + " : valid")
    } else {
        println(it + " : invalid")
    }
}
