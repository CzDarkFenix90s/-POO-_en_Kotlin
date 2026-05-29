fun main() {
    println("=== Ejercicio 1: Libro ===")
    val libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 471)
    libro1.mostrarInformacion()
    println("¿Es antiguo? ${libro1.esAntiguo()}")

    println("\n=== Ejercicio 2: ProductoInventario ===")
    val producto = ProductoInventario("P-001", "Teclado", 29.99, 10)
    println("Precio inicial: ${producto.consultarPrecio()}")
    println("Stock inicial: ${producto.consultarStock()}")
    producto.cambiarPrecio(35.50)
    producto.aumentarStock(5)
    producto.disminuirStock(3)
    println("Precio final: ${producto.consultarPrecio()}")
    println("Stock final: ${producto.consultarStock()}")

    println("\n=== Ejercicio 3: Herencia ===")
    val auto = Auto("Toyota", "Corolla", 2022, 4)
    val moto = Motocicleta("Honda", "CBR500R", 2020, "Alto")
    auto.mostrarDatos()
    moto.mostrarDatos()

    println("\n=== Ejercicio 4: Polimorfismo ===")
    val metodosPago: List<MetodoPago> = listOf(
        PagoEfectivo(),
        PagoTarjeta(),
        PagoTransferencia()
    )

    metodosPago.forEach { metodo ->
        metodo.procesarPago(1250.75)
    }

    println("\n=== Ejercicio 5: Biblioteca ===")
    val biblioteca = Biblioteca()
    biblioteca.registrarLibro(LibroBiblioteca(1, "1984", "George Orwell"))
    biblioteca.registrarLibro(LibroBiblioteca(2, "El Hobbit", "J.R.R. Tolkien"))
    biblioteca.listarLibrosDisponibles()
    biblioteca.prestarLibro("1984")
    biblioteca.prestarLibro("1984")
    biblioteca.devolverLibro("1984")
    biblioteca.buscarLibroPorTitulo("Hobbit")
}
