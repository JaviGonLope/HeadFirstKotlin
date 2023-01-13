package animals

class Lion: Feline() {
    override val image = ""
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Lion is eating $food")
    }
}