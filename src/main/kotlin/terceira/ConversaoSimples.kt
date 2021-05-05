package terceira
/*
Desafio
Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um
valor hexadecimal ou decimal. Você deverá converter cada valor da entrada. Se o valor for hexadecimal, você
deve convertê-lo para decimal e vice-versa. O valor hexadecimal inicia sempre com “0x” ou também, é aquele
valor cuja segunda casa contém a letra 'x'.

Entrada
A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número
não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número
negativo que não deve ser processado, indicando o encerramento do programa.

Saída
Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída.
Todos números hexadecimais devem ser precedidos na saída por '0x' (zero xis).
 */
fun main(args: Array<String>) {
    var s : String
    var n : Long
    val r = """0x.*""".toRegex()
    while(true) {
        s = readLine()!!.toString()
        if(s == "-1"){
            break
        } else if (r.containsMatchIn(s)){
            s = s.replace("0x", "")
            n = s.toLong(radix = 16)
            println(n)
        } else {
            s = s.toLong().toString(radix = 16)
            s = "0x" + s.toUpperCase()
            println(s)
        }
    }
}