import java.util.*
import kotlin.random.Random

val words = listOf(
    "batman",
    "superman",
    "wonderwoman",
    "spawn",
    "naruto",
    "escanor",
    "kira",
    "shiryu",
    "kirito",
    "asuna"
)
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main() {
    setupGame()
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase(Locale.getDefault())
    println(word)

    for (i in words.indices)
        guesses.add('_')

    printStatus()
    println("Enter a letter: ")
}

fun printStatus() {
    when (mistakes) {
        0 -> print0Mistake()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        else -> print6Mistakes()
    }

    print("Word: ")
    for (element in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es) left")
}

fun print0Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}