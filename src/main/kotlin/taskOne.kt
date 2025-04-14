import java.util.Scanner

fun showPayment(){
    val scanner = Scanner(System.`in`)
    val transferFee = 0.0075
    val minTax = 35
    val currency = "рублей"
    print("Введите сумму платежа (в руб.): ")
    val payment = scanner.nextLine().toDouble()
    val yourTax = if ((payment * transferFee) < minTax)  minTax else  (payment * transferFee)
    val paymentMinusTax = (payment - yourTax.toDouble())
    println("Ваш платеж составит: $paymentMinusTax $currency \nC учетом комиссии: $yourTax $currency" )
}