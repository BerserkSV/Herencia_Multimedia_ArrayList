package beans;
public class Multimedia {
    //Atributos
    private String Titulo, Autor, Tamaño;
    //Constructor
    public Multimedia(String Titulo, String Autor, String Tamaño) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Tamaño = Tamaño;
    }
    public Multimedia() {
    }
    //Métodos
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public String getTamaño() {
        return Tamaño;
    }
    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }
    @Override
    public String toString() {
        return "Titulo=" + Titulo + ", Autor=" + Autor + ", Tamaño=" + Tamaño +", ";
    }
}