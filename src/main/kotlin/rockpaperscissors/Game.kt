package rockpaperscissors

import kotlin.random.Random

fun main(args: Array<String>) {
    val options = arrayOf("rock", "paper", "scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}


fun getGameChoice(optionsParam: Array<String>) = optionsParam[Random.nextInt(optionsParam.size)].lowercase()

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    // Loop until the user enters a valid choice
    while (!isValidChoice) {
        // Ask the user for their choice
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        // Read the user input
        val userInput = readLine()

        // Validate the user input
        if (userInput != null && userInput.lowercase() in optionsParam) {
            isValidChoice = true
            userChoice = userInput.lowercase()
        }

        // If the choice is invalid, inform the user
        if (!isValidChoice) println("You must enter a valid choice.")
    }

    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    // Figure out the result
    val result: String = if (userChoice == gameChoice) "Tie"
    else if ((userChoice == "rock") && (gameChoice == "scissors") ||
        (userChoice == "paper") && (gameChoice == "rock") ||
        (userChoice == "scissors") && (gameChoice == "paper")
    ) "You win!"
    else "You lose!"

    // Print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}