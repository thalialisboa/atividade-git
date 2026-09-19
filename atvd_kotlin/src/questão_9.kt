fun main() {
    val tarefas = listOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Comprar pão",
        "Limpar casa"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${indice + 1}: $tarefa")
    }
}