package ejercicio3

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

fun main() {
    println("=== EJECUTANDO DATOS DE VEHÍCULOS ===")

    val miAuto = Auto("Toyota", "Corolla", 2022, 4)
    miAuto.mostrarDatos()

    val miMoto = Motocicleta("Honda", "CB650R", 2023, "Deportivo")
    miMoto.mostrarDatos()

    println("\n--- Lista de Vehículos (Polimorfismo) ---")
    val listaVehiculos: List<Vehiculo> = listOf(
        Auto("Ford", "Mustang", 2021, 2),
        Motocicleta("Yamaha", "MT-07", 2024, "Naked")
    )

    for (vehiculo in listaVehiculos) {
        vehiculo.mostrarDatos()
    }
}