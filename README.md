Herencia_Multimedia_ArrayList
=============================

Ejercicio de Objetos multimedia. Incluye Herencia, Polimorfismo, Override, ArrayList y varios de sus atributos, comentario acerca de compartir posiciones de memoria, instanceof, etc.

// ---------- CLASE MULTIMEDIA ----------

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

// ---------- CLASES PELÍCULA, MÚSICA Y FOTOGRAFÍA ----------

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

// ---------- CLASE OPERADOR_MULTIMEDIA ----------

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

// ---------- CONTENIDO DEL MAIN ----------

package prueba_arraylist_multimedia;
import beans.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Prueba_ArrayList_Multimedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Multimedia> GestionMultimedia = new ArrayList();
        boolean condicion, finalizador = true;
        //Introducción automática de objetos
        Multimedia pelicula1 = new Pelicula("Los Vengadores","Jhos Weedon","2.5Gb","Loki");
        Multimedia pelicula2 = new Pelicula("Origen","Nolan","2.7Gb","Leonardo Dicaprio");
        Multimedia disco1 = new Musica("Mutter","Rammstein","360Mb","Till Lindemann");
        Multimedia disco2 = new Musica("Reise Reise","Rammstein","400Mb","Till Lindemann");
        Multimedia fotografia1 = new Fotografia("Esmiglorodo","Grajamjaumter","5.2Mb","Retmuajmajarg");
        Multimedia fotografia2 = new Fotografia("Astupatapot","Retmuajmajarg","5.6Mb","Grajamjaumter");
        Multimedia pruebamedia = new Multimedia("Pruebaguan","Pruebachu","Pruebazri");
        GestionMultimedia.add(pelicula1);
        GestionMultimedia.add(pelicula2);
        GestionMultimedia.add(disco1);
        GestionMultimedia.add(disco2);
        GestionMultimedia.add(fotografia1);
        GestionMultimedia.add(fotografia2);
        GestionMultimedia.add(pruebamedia);
        Operador_Multimedia Operador = new Operador_Multimedia(GestionMultimedia);
        //¡¡IMPORTANTE!! A partir de aquí, metemos datos después de haber
        //igualado el ArrayList del Operador al de GestionMultimedia, de esta
        //forma, comprobamos que lo que realmente se comparte es la posición
        //de memoria. Ésto quiere decir, que ambos tienen la visibilidad del
        //contenido y ambos pueden modificarlo.
        
        //Manipulación manual de los objetos
        do {
            System.out.println("Indique operación a realizar:");
            System.out.println("1. Agregar nuevos elementos a la lista.");
            System.out.println("2. Mostrar todos los elemenos de la lista.");
            System.out.println("3. Eliminar un elemento de la lista.");
            System.out.println("4. Eliminar todos los elementos de la lista.");
            int operaciones = sc.nextInt();
            switch(operaciones){
                case 1:
                    //Añadir nuevos elementos a la lista:
                    do {
                        condicion = true;
                        System.out.println("Indique el tipo de archivo que quiere introducir:");
                        System.out.println("1. Película.");
                        System.out.println("2. Música.");
                        System.out.println("3. Fotografía.");
                        int var = sc.nextInt();
                        //Hacemos un nextLine para que no nos descojone la linea,
                        //porque nextInt no coge el Enter y lo salta al siguiente.
                        sc.nextLine();
                        switch(var){
                            //Película
                            case 1:
                                System.out.println("Titulo:");
                                String tituloAux = sc.nextLine();
                                System.out.println("Autor:");
                                String autorAux = sc.nextLine();
                                System.out.println("Tamaño:");
                                String tamanyoAux = sc.nextLine();
                                System.out.println("Actor Principal:");
                                String actor = sc.nextLine();
                                //Creamos un new objeto para guardar nuestro objeto
                                Multimedia PeliculaAux = new Pelicula(tituloAux,autorAux,tamanyoAux,actor);
                                //Le pasamos al arraylist el new objeto.
                                GestionMultimedia.add(PeliculaAux);
                                break;
                            case 2:
                                //Musica
                                System.out.println("Titulo:");
                                String tituloAu = sc.nextLine();
                                System.out.println("Autor:");
                                String autorAu = sc.nextLine();
                                System.out.println("Tamaño:");
                                String tamanyoAu = sc.nextLine();
                                System.out.println("Cantante:");
                                String cantante = sc.nextLine();
                                Multimedia MusicaAux = new Musica(tituloAu,autorAu,tamanyoAu,cantante);
                                GestionMultimedia.add(MusicaAux);
                                break;
                            case 3:
                                //Fotografía
                                System.out.println("Titulo:");
                                String tituloA = sc.nextLine();
                                System.out.println("Autor:");
                                String autorA = sc.nextLine();
                                System.out.println("Tamaño:");
                                String tamanyoA = sc.nextLine();
                                System.out.println("Fotografo:");
                                String fotografo = sc.nextLine();
                                Multimedia FotografoAux = new Fotografia(tituloA,autorA,tamanyoA,fotografo);
                                GestionMultimedia.add(FotografoAux);
                                break;
                            default:
                                break;
                        }
                        //Preguntamos al usuario si quiere añadir más elementos.
                        System.out.println("¿Desea añadir algún elemento más?");
                        String sino = sc.next();
                        if (sino.equalsIgnoreCase("No")) {
                            condicion=false;
                        }
                    } while (condicion);
                    break;
                case 2:
                    //Devolvemos todos los valores del ArrayList
                    Operador.returnAll();
                    break;
                case 3:
                    //El usuario ve numerados de 1 a N las posiciones de los objetos
                    System.out.println("Seleccione la posición en la que se encuentra el elemento que"
                            + "desea borrar:");
                    int posicion = sc.nextInt();
                    //Dado que las posiciones en realidad van de 0 a N, debemos
                    //restarle 1 a la posición que nos introduzca
                    System.out.println("Va a borrar "+GestionMultimedia.get(posicion-1).toString()
                            +", ¿Está de acuerdo?");
                    String nosi = sc.next();
                    if (nosi.equalsIgnoreCase("Si")) {
                        //Eliminamos la posición indicada
                        GestionMultimedia.remove(posicion-1);
                        System.out.println("El elemento ha sido borrado.");
                    }
                    break;
                case 4:
                    //El método .clear "limpia" todos los objetos del ArrayList
                    System.out.println("Está a punto de borrar todo el contenido de la lista,"
                            + "¿Está seguro de ello?");
                    String soni = sc.next();
                    if (soni.equalsIgnoreCase("Si")) {
                        GestionMultimedia.clear();
                        System.out.println("Ha borrado todos los elementos de la lista.");
                    }
                    break;
                default:
                    //Por si al usuario le da por hacer el gracioso
                    System.out.println("No ha seleccionado ninguna operación válida.");
                    break;
            }
            System.out.println("¿Desea hacer algo más?");
            String palabro2 = sc.next();
            if (palabro2.equalsIgnoreCase("No")) {
                finalizador = false;
            }
        } while (finalizador);
        System.out.println("-----------------FIN DE PROGRAMA-----------------");
    }
}
