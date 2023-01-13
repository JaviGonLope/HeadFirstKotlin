package animals

class Lynx: Feline() {
    override val image = ""
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }
}