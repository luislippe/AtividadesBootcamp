package segunda
/*
Desafio
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele
não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer
desvio. A moeda deste país é o Loli, cujo símbolo é o R$. Você terá o desafio de ler um valor com duas casas
decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa
deve pagar de Imposto de Renda, segundo a tabela abaixo.

[0 a 2000.00 -> isento] [2000.01 até 3000.00 -> 8%]
[3000.01 até 4500.00 -> 18%] [acima de 4500.00 -> 28%]

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo),
a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser
impresso com duas casas decimais.
 */

const val IMPOST_A = 0f //Renda de 0..2000
const val IMPOST_B = 0.08 //Renda de 2000.01..3000
const val IMPOST_C = 0.18 //Renda de 3000.01..4500
const val IMPOST_D = 0.28 //Renda > 4500

fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if (r in 0.0..2000.0) {
        i = IMPOST_A
    } else if (r <= 3000) {
        i = ((r - 2000) * IMPOST_B).toFloat()
    } else if (r <= 4500) {
        val extraA = 80 //Imposto de 8% sobre 1000
        i = ((r - 3000) * IMPOST_C).toFloat() + extraA
    } else if (r > 4500) {
        val extraB = 350 //Imposto de 18% sobre 1500 + 8% sobre 1000 (270 + 80)
        i = ((r - 4500) * IMPOST_D).toFloat() + extraB
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}