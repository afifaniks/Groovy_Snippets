/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/5/20
 * Web: https://afifaniks.me
 */

// Get Connection
def connection = new URL("https://httpbin.org/post  ").openConnection()
connection.setRequestMethod("POST")
connection.setDoOutput(true)
connection.setRequestProperty("Content-Type", "application/json")

// POST Message
def data = "Boom Boom"
connection.getOutputStream().write(data.getBytes("UTF-8"))

def response = connection.getResponseCode()

println "Response Code:  "+ response

if (response == 200) {
    println(connection.getInputStream().getText())
}