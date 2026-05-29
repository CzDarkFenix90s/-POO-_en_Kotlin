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
