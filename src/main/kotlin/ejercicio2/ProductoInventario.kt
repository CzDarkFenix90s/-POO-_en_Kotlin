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
