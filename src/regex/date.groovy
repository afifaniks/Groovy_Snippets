package regex

import java.text.SimpleDateFormat

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/7/20
 * Web: https://afifaniks.me
 */

def date = "May 29, 2018"
month = date.split("[ ,]")[0]
def d = Date.parse('MMM', month)
def num = d.format('MM') as int
println(num)
