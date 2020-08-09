package regex

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */


def input = "<div>..</div><div>..</div><p>..</p><img></img><p></p><footer></footer>"
def splitRegex = /<.*?>.*?<\/.*?>/

def toList =  input.tokenize(splitRegex)
def map = [:]

toList.each {k -> if (map.get(k) !=  null) map.put(k, ++map.get(k))
                         else map.put(k, 1)
}

map.each { k, v -> if (v/2 == 1) println(k + ": Unique")
            else println(k + ": Not Unique")
}


