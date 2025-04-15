import java.util.*

val scanner = Scanner(System.`in`)

fun showDiscount() {
    val discontOneLevel = 100
    val discontTwoLevel = 0.95
    val discontRegularCustomer = 0.99
    val minSumOnelevelDiscont = 1001
    val minSumTwolevelDiscont = 10_001
    print("Введите сумму покупки: ")
    val purchaseAmount = scanner.nextLine().toInt()
    print("Введите yes если покупатель постоянный, любой символ если нет: ")
    val regularCustomer: Boolean = scanner.nextLine().equals("yes")

    val resultDiscont = when {
        (purchaseAmount >= minSumOnelevelDiscont) && (purchaseAmount < minSumTwolevelDiscont) -> purchaseAmount - discontOneLevel
        purchaseAmount > minSumTwolevelDiscont -> purchaseAmount * discontTwoLevel
        else -> purchaseAmount
    }
    val finalDiscontRegularCustomer =
        if (regularCustomer == true) (resultDiscont.toDouble() * discontRegularCustomer).toInt() else resultDiscont.toInt()
    val discont = purchaseAmount - finalDiscontRegularCustomer
    println("Сумма покупки составит: $finalDiscontRegularCustomer\nВаша скидка: $discont")


}