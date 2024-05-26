import java.util.Map;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.TreeMap;

public class Biblioteca {
    private String libraryName;
    private TreeMap<String, Libro> libros;
    private int indice;

    public Biblioteca(String libraryName) {
        this.libraryName = libraryName;
        libros = new TreeMap<>();
        indice = 1;
    }

    public boolean addNewBook(Libro libro){
        try{
            libros.put(String.valueOf(indice++), libro);
            System.out.println("\n[+] Se ha añadido el libro");
            return true;

        } catch (Exception e){
            System.out.println("\n[!] No se pudo añadir el libro");
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateBook(Libro oldBook, Libro newBook){
        String indiceAntiguo;
        for(Map.Entry<String, Libro> entry : libros.entrySet()){
            if(entry.getValue().equals(oldBook)){
                entry.setValue(newBook);
                System.out.println("\n[+] Se ha sustituido el libro");
                return true;
            }
        }
        System.out.println("\n[!] No se ha encontrado coincidencia");
        return false;
    }
    public boolean removeBook(Libro libroEliminar){
        for(Map.Entry<String, Libro> entry : libros.entrySet()){
            if(entry.getValue().equals(libroEliminar)){
                String indice = entry.getKey();
                libros.remove(indice);
                System.out.println("\n[+] Se ha eliminado el libro");
                return true;
            }
        }
        System.out.println("\n[!] No se ha encontrado coincidencia");
        return false;
    }

    public int findBook(String titulo){
        for(Map.Entry<String, Libro> entry : libros.entrySet()){
            if(entry.getValue().getTitle().equals(titulo)){
                System.out.println("\n[+] Se ha encontrado el libro");
                return Integer.parseInt(entry.getKey());
            }

        }
        System.out.println("\n[!] No se ha encontrado coincidencia");
        return -1;
    }

    public Libro queryBook(String indice){
        for(String indices : libros.keySet()){
            if (indices.equals(indice)){
                System.out.println("\n[+] Se ha encontrado el libro");
                return libros.get(indices);
            }
        }
        System.out.println("\n[!] No se ha encontrado coincidencia");
        return null;
    }

    public void printBooks(){
        System.out.println("\n[+] Lista de libros:");
        for (String indice : libros.keySet()){
            System.out.println(indice + ". " + libros.get(indice).getAuthor() + " -> " + libros.get(indice).getTitle());
        }
    }

}
