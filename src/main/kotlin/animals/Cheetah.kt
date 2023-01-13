package animals

class Cheetah: Feline() {
    override val image = ""
    override val food = ""
    override val habitat = ""

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }
}