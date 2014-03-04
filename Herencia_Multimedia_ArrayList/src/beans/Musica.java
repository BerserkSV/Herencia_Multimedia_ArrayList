package beans;
public class Musica extends Multimedia {
    //Atributos
    private String Cantante;
    //Constructor con llamada al Super Constructor
    public Musica(String Titulo, String Autor, String Tamaño, String Cantante) {
        super(Titulo, Autor, Tamaño);
        this.Cantante = Cantante;
    }
    //Constructor
    public Musica(String Cantante) {
        this.Cantante = Cantante;
    }
    //Métodos
    public String getCantante() {
        return Cantante;
    }
    public void setCantante(String Cantante) {
        this.Cantante = Cantante;
    }
    @Override
    public String toString() {
        return super.toString() + "Cantante=" + Cantante +".";
    }
}