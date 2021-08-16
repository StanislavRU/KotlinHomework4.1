import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcCommissionMasterCard() {
        val transferAmount = 3000
        val previousTransfer = 78000
        val type = PaymentType.MasterCard
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(3800, result)
    }

    @Test
    fun calcCommissionVkPay() {
        val transferAmount = 3000
        val previousTransfer = 78000
        val type = PaymentType.VkPay
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(0, result)
    }

    @Test
    fun calcCommissionVisaMin() {
        val transferAmount = 3000
        val previousTransfer = 78000
        val type = PaymentType.Visa
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(3500, result)
    }

    @Test
    fun calcCommissionVisaNormal() {
        val transferAmount = 3000
        val previousTransfer = 78000
        val type = PaymentType.Visa
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(22500, result)
    }

    @Test
    fun calcCommissionMaestra() {
        val transferAmount = 3000
        val previousTransfer = 78000
        val type = PaymentType.Maestra
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(3800, result)
    }

    @Test
    fun calcCommissionMirMin() {
        val transferAmount = 3000
        val previousTransfer = 78000
        val type = PaymentType.Mir
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(3500, result)
    }

    @Test
    fun calcCommissionMirNormal() {
        val transferAmount = 30000
        val previousTransfer = 78000
        val type = PaymentType.Mir
        var amount = transferAmount * 100

        val result = calcCommission(
            amount = amount,
            type = type,
            previousTransfer = previousTransfer
        )

        assertEquals(22500, result)
    }
}