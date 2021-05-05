package segunda
/*
Desafio
Mariazinha sabe que um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo.
Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7 sem que haja resto.
Então ela pediu para você fazer um programa que aceite diversos valores e diga se cada um destes valores é
primo ou não. Acontece que a paciência não é uma das virtudes de Mariazinha, portanto ela quer que a execução
de todos os casos de teste que ela selecionar (instâncias) aconteçam no tempo máximo de um segundo, pois ela
odeia esperar.

Entrada
A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 200), correspondente ao número de casos de teste.
Seguem N linhas, cada uma contendo um valor inteiro X (1 < X < 231) que pode ser ou não, um número primo.

Saída
Para cada caso de teste imprima a mensagem “Prime” (Primo) ou “Not Prime” (Não Primo)
 */

import kotlin.math.sqrt

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n ) {
        var x = readLine()!!.toLong()
        if(checkPrime(x)){
            println("Prime")
        } else {
            println("Not Prime")
        }
    }
}

fun checkPrime(num: Long): Boolean {
    if(num == 2L) { return true }
    if(num % 2 == 0L) { return false }
    var isPrime = true
    val sroot = sqrt(num.toDouble()).toLong()
    for(i in 3..sroot step 2){
        if(num % i == 0L){
            isPrime = false
            break
        }
    }
    return isPrime
}