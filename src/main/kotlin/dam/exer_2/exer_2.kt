package dam.exer_2

fun main() {
    println(" --- CALCULADORA --- ")

    while(true) {
        println("Escolha a operação: +, -, *, /, &&, ||, !, shl, shr (ou 'sair'): ")
        var uInput = readln().trim().lowercase() // remover espaços extra e converter em lowercase

        if (uInput == "sair") {
            println("A terminar...")
            break
        }

        try {
            calc(uInput)
        } catch (e: NumberFormatException) {
            println("Erro: Entrada inválida. Por favor insira números inteiros (ou true/false para booleanos).")
        } catch (e: ArithmeticException) {
            println("Erro: Divisão por zero não é permitida.")
        }
    }
}

fun calc(op: String) {
    var result = 0

    when (op) {
        "+", "-", "*", "/" -> {
            println("Insira o primeiro número:")
            val n1 = readln().toInt()
            println("Insira o segundo número:")
            val n2 = readln().toInt()

            result = when (op) {
                "+" -> n1 + n2
                "-" -> n1 - n2
                "*" -> n1 * n2
                "/" -> n1 / n2 // Pode lançar ArithmeticException
                else -> 0
            }
        }
    }

    printResults(result)
}

fun printResults(r: Int) {
    println("""
        --- Resultados ---
        Decimal:     $r
        Hexadecimal: 
        Booleano:    
    """)
}