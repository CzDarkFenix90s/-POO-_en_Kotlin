# Universidad UTE

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Logo_UTE.png/600px-Logo_UTE.png" alt="Logo UTE" width="200"/>
</p>

**Estudiante:** Alexis Paz

---

## Tarea: Fundamentos de Programación Orientada a Objetos (POO) en Kotlin

Esta sección del proyecto contiene la implementación de diversos ejercicios prácticos diseñados para aplicar los pilares fundamentales de la POO en el lenguaje Kotlin. A continuación, se detalla el contenido del proyecto:

### Descripción de los Ejercicios

1. **[Libro.kt](src/main/kotlin/ejercicio1/Libro.kt)**
   *   **Concepto:** Clases y Objetos.
   *   **Implementación:** Clase `Libro` con atributos como título, autor y año. Incluye lógica para clasificar libros como "Antiguos" (antes del año 2000) o "Recientes".

2. **[ProductoInventario.kt](src/main/kotlin/ejercicio2/ProductoInventario.kt)**
   *   **Concepto:** Encapsulamiento.
   *   **Implementación:** Uso de modificadores de acceso `private`. El código garantiza la integridad de los datos mediante validaciones que impiden precios negativos o stock menor a cero.

3. **[Vehiculo.kt](src/main/kotlin/ejercicio3/Vehiculo.kt)**
   *   **Concepto:** Herencia.
   *   **Implementación:** Estructura jerárquica con clase base `Vehiculo` y clases derivadas `Auto` y `Motocicleta`. Demuestra la herencia de atributos y la sobreescritura de métodos (`mostrarDatos`).

4. **[MetodoPago.kt](src/main/kotlin/ejercicio4/MetodoPago.kt)**
   *   **Concepto:** Polimorfismo e Interfaces.
   *   **Implementación:** Uso de la interfaz `MetodoPago` para procesar pagos (Efectivo, Tarjeta y Transferencia). Permite manejar múltiples formas de pago bajo un mismo contrato.

5. **[Biblioteca.kt](src/main/kotlin/ejercicio5/Biblioteca.kt) (Extra)**
   *   **Concepto:** Gestión de Colecciones.
   *   **Implementación:** Un sistema de biblioteca para registrar, buscar y prestar libros, integrando todos los conceptos anteriores.

---
