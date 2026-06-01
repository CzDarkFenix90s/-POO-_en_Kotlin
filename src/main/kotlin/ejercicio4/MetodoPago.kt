package ejercicio4

interface MetodoPago {
    fun procesarPago(monto: Double)
}

class PagoEfectivo : MetodoPago {
    override fun procesarPago(monto: Double) {
        println("Pago en efectivo procesado: $${"%.2f".format(monto)}")
    }
}

class PagoTarjeta : MetodoPago {
    override fun procesarPago(monto: Double) {
        println("Pago con tarjeta aprobado: $${"%.2f".format(monto)}")
    }
}

class PagoTransferencia : MetodoPago {
    override fun procesarPago(monto: Double) {
        println("Pago por transferencia recibido: $${"%.2f".format(monto)}")
    }
}

fun main() {
    println("=== EJECUTANDO MÉTODOS DE PAGO ===")

    val pago1: MetodoPago = PagoEfectivo()
    pago1.procesarPago(1250.75)

    val pago2: MetodoPago = PagoTarjeta()
    pago2.procesarPago(500.00)

    val pago3: MetodoPago = PagoTransferencia()
    pago3.procesarPago(85.50)
}