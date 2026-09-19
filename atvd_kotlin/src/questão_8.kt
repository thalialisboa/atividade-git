fun main() {
    val pratos = listOf("Hambúrguer", "Pizza", "Sushi", "Lasanha")
    val itemEsgotado = "Pizza"

    for (prato in pratos) {
        if (prato == itemEsgotado) {
            continue
        }

        println("Item disponível: $prato")
    }
}