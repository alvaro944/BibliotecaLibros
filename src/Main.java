
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        menu();

        Biblioteca biblioteca = new Biblioteca("Biblioteca municipal");

        //Creamos vaios libros

        Libro libro1 = new Libro("1984", "George Orwell");
        Libro libro2 = new Libro("To Kill a Mockingbird", "Harper Lee");
        Libro libro3 = new Libro("The Great Gatsby", "F. Scott Fitzgerald");
        Libro libro4 = new Libro("Pride and Prejudice", "Jane Austen");
        Libro libro5 = new Libro("The Catcher in the Rye", "J.D. Salinger");


        do {

            System.out.print("\n[+] Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("\n[+] Saliendo...");
                    break;
                case 1:
                    biblioteca.printBooks();
                    break;
                case 2:
                    System.out.println("\n[+] Agregamos los 5 libros");
                    biblioteca.addNewBook(libro1);
                    biblioteca.addNewBook(libro2);
                    biblioteca.addNewBook(libro3);
                    biblioteca.addNewBook(libro4);
                    biblioteca.addNewBook(libro5);
                    break;
                case 3:
                    System.out.println("\n[+] Actualizamos el libro 4 por este -> titulo: Moby Dick y autor: Herman Melville");
                    Libro libro6 = new Libro("Moby Dick", "Herman Melville");
                    biblioteca.updateBook(libro4, libro6);
                    break;
                case 4:
                    System.out.println("\n[+] Eliminamos el libro 3");
                    biblioteca.removeBook(libro3);
                    break;
                case 5:
                    System.out.println("\n[+] buscamos el libro 2 con titulo: To Kill a Mockingbird");
                    biblioteca.findBook("To Kill a Mockingbird");
                    break;
                case 6:
                    menu();
                    break;
                default:
                    System.out.println("\n[+] Opción no válida");
                    break;

            }
        } while (opcion != 0);

    }

    public static void menu() {
        System.out.println("\nMENU");
        System.out.println("0 Salir");
        System.out.println("1 imprimir libros");
        System.out.println("2 agregar un nuevo libro");
        System.out.println("3 actualizar un libro exitente");
        System.out.println("4 eliminar un libro de la lista");
        System.out.println("5 buscar un libro por título");
        System.out.println("6 Imprimir lista de opciones");
    }
}
