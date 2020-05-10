package proyecto;

import java.util.Scanner;

public class PartidaNueva {

    Scanner teclado = new Scanner(System.in);
    String Nombre;
    String Dificultad;
    String Tipo;
    String Contraseña;

    public PartidaNueva(String Nombre, String Dificultad, String Tipo, String Contraseña) {
        this.Nombre = Nombre;
        this.Dificultad = Dificultad;
        this.Tipo = Tipo;
        this.Contraseña = Contraseña;

    }

    public PartidaNueva() {

    }

    public void NuevaPartida() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("                                     CREAR UNA NUEVA PARTIDA");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

        System.out.print("                              Digite el nombre para la partida: ");
//         "Partida1"
        Nombre = teclado.next();
        System.out.println("                                    Nombre Seleccionado");

        System.out.print("                            Digite una contraseña para la partida: ");
        // Jose123
        Contraseña = teclado.next();
        System.out.println("                                    Contraseña Guardada");

        String difi1 = "Facil";
        String difi2 = "Intermedio";
        String difi3 = "Dificil";

        System.out.print("                        Digite la dificultad que quiere en la partida\n                                 Facil,intermedio,Dificil : ");
        Dificultad = teclado.next();

        if (difi1.equalsIgnoreCase(Dificultad) || difi2.equalsIgnoreCase(Dificultad) || difi3.equalsIgnoreCase(Dificultad)) {
            System.out.println("                                    Dificultad Seleccionada");
        } else {
            System.out.println("                     Dificultad incorrecta digite una de las 3 dificultades permitidas");
        }

        String T1 = "Online";
        String T2 = "Offline";
        System.out.print("                    Digite el tipo de juego que quiere seleccionar para la partida,\n                                      Online/Offline: ");

        Tipo = teclado.next();

        if (T1.equalsIgnoreCase(Tipo) || T2.equalsIgnoreCase(Tipo)) {

            System.out.println("                                   Tipo de juego seleccionado");
        } else {
            System.out.println("                            Tipo incorrecto, Seleccione una de los dos tipos");
        }

        MostrarDatos();
    }

    private void MostrarDatos() {
        System.out.println();
        System.out.println("                              LOS DATOS DE LA NUEVA PARTIDA SON:");
        System.out.println("                                Nombre de la partida: " + Nombre);
        System.out.println("                             Dificultad de la partida: " + Dificultad);
        System.out.println("                                     Tipo de partida: " + Tipo);
        System.out.println("                               Contraseña de partida: " + Contraseña);
        
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************************************************");
        System.out.println("                                       ENTRANDO AL JUEGO...");
         System.out.println("*******************************************************************************************");

    }

}
