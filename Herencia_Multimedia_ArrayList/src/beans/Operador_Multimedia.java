package beans;
import java.util.ArrayList;
public class Operador_Multimedia {
    //Atributos
    private ArrayList<Multimedia> Operador;
    //Constructor
    public Operador_Multimedia(ArrayList<Multimedia> Operador) {
        this.Operador = Operador;
    }
    //Métodos
    public void returnAll(){
    //El método returnAll es un método implementado por mi, el cual en este caso
    //recorre todo el ArrayList hasta su final, independientemente de lo grande
    //que sea, y divide los objetos por su tipo usando instanceof.
        for (int i = 0; i < Operador.size(); i++) {
            if (Operador.get(i) instanceof Pelicula) {
                System.out.println((i+1)+"º Elemento multimedia: Película. Datos:");
                System.out.println(Operador.get(i).toString());
            }
            else if (Operador.get(i) instanceof Musica) {
                System.out.println((i+1)+"º Elemento multimedia: CD de Música. Datos:");
                System.out.println(Operador.get(i).toString());
            }
            else if (Operador.get(i) instanceof Fotografia){
                System.out.println((i+1)+"º Elemento multimedia: Fotografía. Datos:");
                System.out.println(Operador.get(i).toString());
            } else {
                System.out.println((i+1)+"º ERROR. OBJETO EXTRAÑO.");
            }
        }
    }
}