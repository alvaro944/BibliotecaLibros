# Ejercicio 1: Biblioteca de Libros

**Descripción:**
Crea un programa que implemente una biblioteca de libros y sus detalles con las siguientes capacidades.

## Parte A: Clase Libro

1. Implementa la clase `Libro` con los siguientes atributos:
    - `String title`
    - `String author`
    - Un constructor con dos `Strings` para inicializar los atributos.
    - Métodos `getTitle`, `getAuthor` y `createLibro` (estático, que recibe dos parámetros de tipo `String` y devuelve una instancia de `Libro`).

## Parte B: Clase Biblioteca

2. Implementa la clase `Biblioteca` con los siguientes atributos y métodos:
    - `String libraryName`
    - `TreeMap<String, Libro> libros`
    - Un constructor que recibe el nombre de la biblioteca e instancia `libros`.
    - `addNewBook`, recibe un parámetro de tipo `Libro` y devuelve `boolean` indicando si el libro se pudo añadir.
    - `updateBook`, recibe dos parámetros de tipo `Libro` (el antiguo y el nuevo) y devuelve `boolean`.
    - `removeBook`, recibe un parámetro de tipo `Libro` y devuelve `boolean`.
    - `findBook`, recibe un parámetro de tipo `Libro` y devuelve `int` (posición en la lista o -1).
    - `findBook`, recibe un `String` y busca el libro por título.
    - `queryBook`, recibe un `String` y devuelve una instancia de `Libro`.
    - `printBooks`, imprime los libros en el siguiente formato:
      ```
      Lista de libros:
      1. El Quijote → Miguel de Cervantes
      2. Cien Años de Soledad → Gabriel García Márquez
      3. Matar a un Ruiseñor → Harper Lee
      ```

## Parte C: Clase Main

3. Crea una clase `Main` con un método `main` y agrega un menú de opciones:
    - 0 salir.
    - 1 imprimir libros, llamará a `printBooks`.
    - 2 agregar un nuevo libro.
    - 3 actualizar un libro existente.
    - 4 eliminar libro de la lista.
    - 5 buscar libro por título.
    - 6 volver a imprimir la lista de opciones.
