package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def ipRegex = /^((2?[0-5][0-5]|1?[0-9][0-9]|[1-9][1-9])\.){3}(2?[0-5][0-5]|1?[0-9][0-9]|[1-9][1-9])$/
def ip = ["10.10.10.10","310.10.10.10","255.10.10.10","2555.10.10.10"]

ip.each {
    if (it.matches(ipRegex)) {
        println it + ": valid"
    } else {
        println it + ": invalid"
    }
}