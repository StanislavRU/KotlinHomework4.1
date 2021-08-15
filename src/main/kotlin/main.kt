fun main() {
    val transferAmount = 3000
    val previousTransfer = 78000
    val type = PaymentType.MasterCard

    var amount = transferAmount * 100
    val commission = calcCommission(amount, type, previousTransfer)
    amount += commission
    val resultAmount = amount.toDouble() / 100
    val resultCommission = commission.toDouble() / 100

    println("Сумма перевода: $resultAmount рублей, включая сумму комиссии\n" +
        "Сумма комиссии составляет: $resultCommission рублей")
}

fun calcCommission (amount: Int, type: PaymentType = PaymentType.VkPay, previousTransfer: Int = 0): Int {
    return when (type) {
        PaymentType.VkPay -> 0
        PaymentType.MasterCard, PaymentType.Maestra -> if (previousTransfer <= 75000) 0 else
                ((amount * 0.006) + 2000).toInt()
        PaymentType.Visa, PaymentType.Mir -> if (amount * 0.0075 <= 3500) 3500 else (amount * 0.0075).toInt()
    }
}

enum class PaymentType {
    VkPay, MasterCard, Maestra, Visa, Mir
}