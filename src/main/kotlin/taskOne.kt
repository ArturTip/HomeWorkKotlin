fun showPayment(payment : Double){
    val transferFee = 0.0075
    val minTax = 35

    val yourTax = if ((payment * transferFee) < minTax)  minTax else  (payment * transferFee)
    var paymentMinusTax = (payment - yourTax.toDouble())

    println("Ваш платеж составит: $paymentMinusTax \nC учетом комиссии: $yourTax")
}