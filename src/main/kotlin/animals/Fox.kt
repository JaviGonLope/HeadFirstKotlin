package animals

class Fox: Canine() {
    override val image = ""
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }
}