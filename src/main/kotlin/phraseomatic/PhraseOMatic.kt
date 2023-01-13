import kotlin.random.Random

fun main(args: Array<String>) {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process","paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = Random.nextInt(arraySize1)
    val rand2 = Random.nextInt(arraySize2)
    val rand3 = Random.nextInt(arraySize3)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}