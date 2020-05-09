package proyecto;
import java.util.Scanner;

public class SeleccionPersonaje {
Scanner teclado=new Scanner (System.in);

    private String Nombre;

    public SeleccionPersonaje(String Nombre) {
        this.Nombre = Nombre;

        
    }
public SeleccionPersonaje(){

}
public void Seleccion(){
    System.out.println("                                           PERSONAJES                                   ");
    System.out.println("         Edinson               Gabriela                   David                   Jency ");
System.out.print("                Por favor Digite El nombre del personaje que quiere elegir: ");
    
ValidarPersonaje();
}


    private void ValidarPersonaje() {
        String Nombre1= "Edinson";
        String Nombre2= "Gabriela";
        String Nombre3= "David";
        String Nombre4= "Jency";
        
         Nombre=teclado.next(); 
         System.out.println();
        if (Nombre1.equalsIgnoreCase(Nombre)) {
            System.out.println("                  Has elegido a "+Nombre+ " las habilidades de tu personaje son:\n                                        -Astucia\n"
                    + "                                   -Vestuario y Estilo                                   \n"
                    + "                                       -Oratoria                                         \n"
                    + "                                  -Manejo de Animales                                     ");
            System.out.println();
        }
        if (Nombre2.equalsIgnoreCase(Nombre)) {
            System.out.println("                  Has elegido a "+Nombre+ " las habilidades de tu personaje son:\n                                      -Determinacion\n"
                    + "                                         -Liderazgo                                     \n"
                    + "                                    -Persuasión y Labia                                 \n"
                    + "                                      -Cultura General                                    ");
             System.out.println();
        }
        if (Nombre3.equalsIgnoreCase(Nombre)) {
            System.out.println("                  Has elegido a "+Nombre+ " las habilidades de tu personaje son:\n                                       -Sexto Sentido\n"
                    + "                                -Conocimiento de la Calle\n"
                    + "                                         -Intimidar\n"
                    + "                                        -Interpretar\n"
                    + "");
             System.out.println();
        }
        if (Nombre4.equalsIgnoreCase(Nombre)) {
            System.out.println("                  Has elegido a "+Nombre+ " las habilidades de tu personaje son:\n                                         -Seducción\n"
                    + "                                -Habilidades de Inteligencia                              \n"
                    + "                                      -Vigilar/Rastrear                                    \n"
                    + "                                           -Disfraz                                         ");
             System.out.println();
        }

    }

}
