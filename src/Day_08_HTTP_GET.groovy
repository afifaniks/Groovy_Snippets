/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/5/20
 * Web: https://afifaniks.me
 */

// Get Connection
def connection = new URL("https://afifaniks.me").openConnection()
def response = connection.getResponseCode()

println "Response Code:  "+ response

if (response == 200) {
    println(connection.getInputStream().getText())
}