
package desarrollo.LibroEjercicio;


public class Libro {
    private String nombre;
    private String editorial;
    private int paginas;

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getEditorial() {
        return editorial;
    }

    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro: " + "nombre=" + nombre + ", editorial=" + editorial + ", paginas=" + paginas + '}';
    }

    
    public int getPaginas() {
        return paginas;
    }

    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
}
