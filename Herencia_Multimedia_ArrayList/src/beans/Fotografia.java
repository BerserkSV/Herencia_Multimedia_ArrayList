package beans;
public class Fotografia extends Multimedia {
    //Atributos
    private String Fotografo;
    //Constructor con llamada al Super Constructor
    public Fotografia(String Titulo, String Autor, String Tamaño, String Fotografo) {
        super(Titulo, Autor, Tamaño);
        this.Fotografo = Fotografo;
    }
    //Constructor
    public Fotografia(String Fotografo) {
        this.Fotografo = Fotografo;
    }
    //Métodos
    public String getFotografo() {
        return Fotografo;
    }
    public void setFotografo(String Fotografo) {
        this.Fotografo = Fotografo;
    }
    @Override
    public String toString() {
        return super.toString() + "Fotografo=" + Fotografo +".";
    }
}