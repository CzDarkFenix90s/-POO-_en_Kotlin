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
        println("Anio de publicacion: $anioPublicacion")
        println("Numero de paginas: $numeroPaginas")
    }

    fun esAntiguo(): Boolean {
        return anioPublicacion < 2000
    }
}

fun main() {
    println("=== EJECUTANDO REGISTRO DE LIBROS ===")

    val libro1 = Libro("Ficciones", "Jorge Luis Borges", 1944, 180)
    libro1.mostrarInformacion()
    println("¿Es antiguo?: ${if (libro1.esAntiguo()) "Si" else "No"}")

    val libro2 = Libro("Proyecto Hail Mary", "Andy Weir", 2021, 480)
    libro2.mostrarInformacion()
    println("¿Es antiguo?: ${if (libro2.esAntiguo()) "Si" else "No"}")
}