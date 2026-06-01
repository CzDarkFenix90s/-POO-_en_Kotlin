package ejercicio2

class ProductoInventario(
    private val codigo: String,
    private val nombre: String,
    private var precio: Double,
    private var stock: Int
) {
    fun consultarPrecio(): Double = precio

    fun consultarStock(): Int = stock

    fun aumentarStock(cantidad: Int) {
        require(cantidad >= 0) { "La cantidad a aumentar no puede ser negativa." }
        stock += cantidad
    }

    fun disminuirStock(cantidad: Int) {
        require(cantidad >= 0) { "La cantidad a disminuir no puede ser negativa." }
        require(stock - cantidad >= 0) { "El stock no puede quedar por debajo de cero." }
        stock -= cantidad
    }

    fun cambiarPrecio(nuevoPrecio: Double) {
        require(nuevoPrecio >= 0) { "El precio no puede ser negativo." }
        precio = nuevoPrecio
    }
}

// === FUNCIÓN MAIN PARA CORRER EL INVENTARIO ===
fun main() {
    println("=== EJECUTANDO CONTROL DE INVENTARIO ===")

    val producto = ProductoInventario("PROD-001", "Laptop Gamer", 1200.00, 10)
    println("Producto registrado con éxito.")
    println("Stock inicial: ${producto.consultarStock()} unidades")
    println("Precio inicial: $${producto.consultarPrecio()}")

    println("\n--- Recibiendo mercancía (Aumentando stock +5) ---")
    producto.aumentarStock(5)
    println("Nuevo stock: ${producto.consultarStock()} unidades")

    println("\n--- Realizando venta (Disminuyendo stock -3) ---")
    producto.disminuirStock(3)
    println("Nuevo stock: ${producto.consultarStock()} unidades")

    println("\n--- Aplicando cambio de precio ---")
    producto.cambiarPrecio(1150.00)
    println("Nuevo precio: $${producto.consultarPrecio()}")
}