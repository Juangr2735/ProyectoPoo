package proyecto;

import java.util.Scanner;

public class PROYECTO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Administrador Admin1 = new Administrador("Kevin", "Beltran", 589712, "Organizador de cuentas");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("                             BIENVENIDO AL MEJOR JUEGO                                 ");
        System.out.println("                             EL TERROR DEL GRAN SALTO                                  ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        int opcion, op;
        System.out.println("                              ¿QUE DESEA HACER?                                      ");
        System.out.println("             1/Registrarme                         2/ Iniciar sesion                ");
        System.out.print("                              DIGITE UNA OPCION:");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            System.out.println();
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("                           Bienvenido al registro                                   ");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("                  Por favor Diligencie los siguientes datos:                               ");
            Registro User = new Registro();
            //"joseAcosta@gmail.com";
            //"jose123";
            User.Registrar();

            Admin1.AdminAsignado();

            SeleccionPersonaje Edinson = new SeleccionPersonaje();
            Edinson.Seleccion();

            PartidaNueva User2 = new PartidaNueva();
            User2.NuevaPartida();

        } else if (opcion == 2) {
            System.out.println();
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("                                     INICIA SESION                                            ");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            InicioSesion User1 = new InicioSesion();
            //"jose21365@gmail.com";
            //"jose123";
            User1.IniciarSesion();
            System.out.println("                                   ¿QUE DESEA HACER?                                      ");
            System.out.println("            1/Cargar una partida                         2/ Crear una partida               ");
            System.out.print("                                 Digite una opcion:");
            op = teclado.nextInt();
            if (op == 1) {
                PartidaGuardada User3 = new PartidaGuardada();
                User3.IngresaPartida();

            } else if (op == 2) {
                SeleccionPersonaje Edinson = new SeleccionPersonaje();
                Edinson.Seleccion();

                PartidaNueva User2 = new PartidaNueva();
                User2.NuevaPartida();

            }

        }System.out.println("chale");

    }

}
