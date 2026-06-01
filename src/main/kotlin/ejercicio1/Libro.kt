package ejercicio1

class Libro(
    private val titulo: String,
    private val autor: String,
    private val anioPublicacion: Int,
    private val numeroPaginas: Int
) {
    fun mostrarInformacion() {
        println("Libro: $titulo")
        println("Autor: $autor")
        println("Anio de publicacion: $anioPublicacion") // Cambiado 'Año' por 'Anio'
        println("Numero de paginas: $numeroPaginas")      // Quitada la tilde
    }

    fun esAntiguo(): Boolean {
        return anioPublicacion < 2000
    }
}

// === FUNCIÓN MAIN ===
fun main() {
    println("=== EJECUTANDO REGISTRO DE LIBROS ===")

    // 1. Creamos un libro moderno
    val libro1 = Libro("Ficciones", "Jorge Luis Borges", 1944, 180)
    libro1.mostrarInformacion()
    println("¿Es antiguo?: ${if (libro1.esAntiguo()) "Si" else "No"}") // Cambiado "Sí" por "Si"

    println("\n-----------------------------------\n")

    // 2. Creamos un libro más reciente
    val libro2 = Libro("Proyecto Hail Mary", "Andy Weir", 2021, 480)
    libro2.mostrarInformacion()
    println("¿Es antiguo?: ${if (libro2.esAntiguo()) "Si" else "No"}") // Cambiado "Sí" por "Si"
}