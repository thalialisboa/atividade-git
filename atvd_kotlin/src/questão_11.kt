fun main() {
    val tamanho = 5

    for (linha in 1..tamanho) {
        for (coluna in 1..tamanho) {
            if (linha == coluna) {
                print("X ")
            } else {
                print("* ")
            }
        }
        println()
    }
}