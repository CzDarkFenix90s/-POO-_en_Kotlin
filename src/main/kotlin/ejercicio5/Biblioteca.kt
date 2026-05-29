class LibroBiblioteca(
    private val id: Int,
    private val titulo: String,
    private val autor: String,
    private var estado: String = "disponible"
) {
    fun getTitulo(): String = titulo

    fun comprobarEstado(): String = estado

    fun prestar(): Boolean {
        if (estado == "prestado") {
            return false
        }
        estado = "prestado"
        return true
    }

    fun devolver(): Boolean {
        if (estado == "disponible") {
            return false
        }
        estado = "disponible"
        return true
    }

    fun mostrarInformacion(): String {
        return "ID: $id | Título: $titulo | Autor: $autor | Estado: $estado"
    }
}

class Biblioteca {
    private val libros = mutableListOf<LibroBiblioteca>()

    fun registrarLibro(libro: LibroBiblioteca) {
        libros.add(libro)
        println("Libro registrado: ${libro.mostrarInformacion()}")
    }

    fun listarLibrosDisponibles() {
        println("Libros disponibles:")
        libros.filter { it.comprobarEstado() == "disponible" }.forEach { println(it.mostrarInformacion()) }
    }

    fun prestarLibro(titulo: String) {
        val libro = libros.find { it.getTitulo().equals(titulo, ignoreCase = true) }
        if (libro == null) {
            println("Libro no encontrado: $titulo")
            return
        }

        if (libro.prestar()) {
            println("Libro prestado: $titulo")
        } else {
            println("El libro ya está prestado: $titulo")
        }
    }

    fun devolverLibro(titulo: String) {
        val libro = libros.find { it.getTitulo().equals(titulo, ignoreCase = true) }
        if (libro == null) {
            println("Libro no encontrado: $titulo")
            return
        }

        if (libro.devolver()) {
            println("Libro devuelto: $titulo")
        } else {
            println("El libro no estaba prestado: $titulo")
        }
    }

    fun buscarLibroPorTitulo(titulo: String) {
        val libro = libros.find { it.getTitulo().contains(titulo, ignoreCase = true) }
        if (libro == null) {
            println("No se encontró ningún libro con título que contenga: $titulo")
        } else {
            println("Búsqueda encontrada: ${libro.mostrarInformacion()}")
        }
    }
}
