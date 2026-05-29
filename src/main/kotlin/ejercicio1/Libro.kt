class Libro(
    private val titulo: String,
    private val autor: String,
    private val anioPublicacion: Int,
    private val numeroPaginas: Int
) {
    fun mostrarInformacion() {
        println("Libro: $titulo")
        println("Autor: $autor")
        println("Año de publicación: $anioPublicacion")
        println("Número de páginas: $numeroPaginas")
    }

    fun esAntiguo(): Boolean {
        return anioPublicacion < 2000
    }
}
