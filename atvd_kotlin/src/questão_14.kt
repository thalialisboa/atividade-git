fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero < 0) {
        println("Não é possível calcular fatorial de número negativo.")
    } else {
        var fatorial = 1L
        var contador = numero

        while (contador > 1) {
            fatorial *= contador
            contador--
        }

        println("O fatorial de $numero é $fatorial")
    }
}