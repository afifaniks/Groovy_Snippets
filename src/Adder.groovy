/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 7/30/20
 * Web: https://afifaniks.me
 */
class Adder {
    def a
    def b

    Adder(a, b) {
        this.a = a
        this.b = b
    }

    def add() {
        return a + b
    }
}
