package beans;
public class Pelicula extends Multimedia{
    //Atributos
    private String actorPrincipal;
    //Constructor con llamada al Super Constructor
    public Pelicula(String Titulo, String Autor, String Tamaño, String actorPrincipal) {
        super(Titulo, Autor, Tamaño);
        this.actorPrincipal = actorPrincipal;
    }
    //Constructor
    public Pelicula(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }
    //Métodos
    public String getActorPrincipal() {
        return actorPrincipal;
    }
    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }
    @Override
    public String toString() {
        return super.toString() + "Actor Principal=" + actorPrincipal +".";
    }
}