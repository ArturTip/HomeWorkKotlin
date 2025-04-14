import java.util.Scanner

fun showPayment() {
    val scanner = Scanner(System.`in`)
    val transferFee = 0.0075
    val minTax = 35
    val currency = "руб."
    while (true) {
        print("Введите сумму платежа (в $currency): ")
        val payment = scanner.nextLine().toDouble()
        val yourTax = if ((payment * transferFee) < minTax) minTax else (payment * transferFee)
        val amount = (payment - yourTax.toDouble())
        println("Ваш платеж составит: $amount $currency \nC учетом комиссии: $yourTax $currency")
    }
}