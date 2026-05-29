open class Vehiculo(
    protected val marca: String,
    protected val modelo: String,
    protected val anio: Int
) {
    open fun mostrarDatos() {
        println("Vehículo: $marca $modelo - Año $anio")
    }
}

class Auto(
    marca: String,
    modelo: String,
    anio: Int,
    private val numeroPuertas: Int
) : Vehiculo(marca, modelo, anio) {
    override fun mostrarDatos() {
        println("Auto: $marca $modelo - Año $anio - Puertas: $numeroPuertas")
    }
}

class Motocicleta(
    marca: String,
    modelo: String,
    anio: Int,
    private val tipoManubrio: String
) : Vehiculo(marca, modelo, anio) {
    override fun mostrarDatos() {
        println("Motocicleta: $marca $modelo - Año $anio - Tipo de manubrio: $tipoManubrio")
    }
}
