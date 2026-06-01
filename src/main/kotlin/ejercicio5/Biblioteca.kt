package ejercicio5

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
        return "ID: $id | Titulo: $titulo | Autor: $autor | Estado: $estado"
    }
}

class Biblioteca {
    private val libros = mutableListOf<LibroBiblioteca>()

    fun registrarLibro(libro: LibroBiblioteca) {
        libros.add(libro)
        println("Libro registrado: ${libro.mostrarInformacion()}")
    }

    fun listarLibrosDisponibles() {
        println("Libros disponibles:") // Quitada tilde de 'disponibles' en el texto plano si diera error
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
            println("El libro ya esta prestado: $titulo")
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
            println("No se encontro ningun libro con titulo que contenga: $titulo")
        } else {
            println("Busqueda encontrada: ${libro.mostrarInformacion()}")
        }
    }
}

fun main() {
    println("=== EJECUTANDO SISTEMA DE BIBLIOTECA ===")
    val biblioteca = Biblioteca()

    println("--- Registrando Libros ---")
    val libro1 = LibroBiblioteca(1, "1984", "George Orwell")
    val libro2 = LibroBiblioteca(2, "El Hobbit", "J.R.R. Tolkien")
    biblioteca.registrarLibro(libro1)
    biblioteca.registrarLibro(libro2)

    println("\n--- Lista Inicial ---")
    biblioteca.listarLibrosDisponibles()

    println("\n--- Prestando un libro ---")
    biblioteca.prestarLibro("1984")

    println("\n--- Lista tras el prestamo ---")
    biblioteca.listarLibrosDisponibles()

    println("\n--- Probando Busqueda ---")
    biblioteca.buscarLibroPorTitulo("Hobbit")

    println("\n--- Devolviendo el libro ---")
    biblioteca.devolverLibro("1984")
}