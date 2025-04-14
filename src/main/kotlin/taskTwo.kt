import java.util.*

fun showLikes() {
    val scanner = Scanner(System.`in`)
    while (true) {
        print("Введите количество лайков: ")
        val likes = scanner.nextLine().toInt()
        val formatText = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
        println("Нравиться: $likes $formatText")
    }

}