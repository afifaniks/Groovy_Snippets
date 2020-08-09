package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/5/20
 * Web: https://afifaniks.me
 */

def foo = "he he goes to school"
def fooArr = foo.split("\\s+")
def map = [:]

fooArr.each {k -> if (map.get(k) !=  null) map.put(k, ++map.get(k))
                  else map.put(k, 1)
}

map.each {k, v ->
    print k + ": " + v + " "
}
