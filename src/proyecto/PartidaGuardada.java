package proyecto;
import java.util.Scanner;
public class PartidaGuardada {
Scanner teclado=new Scanner (System.in);
    private String Contraseña;
    private String Nombre;

    public PartidaGuardada(String Nombre, String Contraseña) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;

    }
    public PartidaGuardada(){
    
    }

    public void IngresaPartida() {
        String PartidaG= "Partida1"; 
        String Contra= "jose123";
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("                                INICIO SESION PARTIDA");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.print("                      Digite el nombre de la partida:");
        Nombre=teclado.next();
        System.out.print("                           Digite la contraseña: ");
        Contraseña=teclado.next();
        if (PartidaG.equalsIgnoreCase(Nombre) && Contra.equals(Contraseña)) {
            System.out.println("                          BIENVENIDO DE NUEVO A LA PARTIDA");
            
            System.out.println();
            System.out.println();
            System.out.println("****************************************************************************************");
            System.out.println("                                  ENTRANDO AL JUEGO...");
            System.out.println("****************************************************************************************");
        }
        else{
             System.out.println("       El sistema no detectó una partida guardada con este nombre, revise el nombre o la contraseña");
        
        }

    }

}
