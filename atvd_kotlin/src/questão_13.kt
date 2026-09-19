fun main() {
    val numero = 29
    var ehPrimo = true

    if (numero <= 1) {
        ehPrimo = false
    } else {
        for (divisor in 2 until numero) {
            if (numero % divisor == 0) {
                ehPrimo = false
                break
            }
        }
    }

    if (ehPrimo) {
        println("$numero é um número primo.")
    } else {
        println("$numero não é um número primo.")
    }
}