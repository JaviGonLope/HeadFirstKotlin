package animals

abstract class Animal: Roamable {
    abstract val image : String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    /*
        Make a function abstract if it's always overriden.
        By making this function abstract, we're telling the compiler that there’s no useful code you can
        write for the function body.
     */
    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The animal is roaming")

    }
    fun sleep() {
        println("The animal is sleeping")
    }
}