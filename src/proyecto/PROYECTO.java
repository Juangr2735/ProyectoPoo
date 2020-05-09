package proyecto;
import java.util.Scanner; 
public class PROYECTO {
    
    public static void main(String[] args) {
         Scanner teclado= new Scanner (System.in);
           System.out.println("BIENVENIDO AL MEJOR JUEGO \n¿QUE DESEA HACER?");
           int opcion,op;
           
           System.out.println("1/Registrarme\n2/ Iniciar sesion");
        System.out.print("DIGITE UNA OPCION:");
        opcion = teclado.nextInt();
         if(opcion==1){
             System.out.println("REGISTRAR COÑO");
         Registro User =new Registro();
        //"joseAcosta@gmail.com";
        //"jose123";
        User.Registrar(); 
        
         SeleccionPersonaje Edinson = new SeleccionPersonaje ();
        Edinson.Seleccion();
         
        PartidaNueva User2= new PartidaNueva (); 
        User2.NuevaPartida();
        
         }
           else if (opcion==2){
                System.out.println("INICIA SESION ");
           InicioSesion User1= new InicioSesion(); 
        //"jose21365@gmail.com";
          //"jose123";
        User1.IniciarSesion();
        
           System.out.print("QUE DESEA HACER?\n1-Cargar una partida\n2- Crear una partida:");
            op=teclado.nextInt(); 
           if (op==1){
            PartidaGuardada User3= new PartidaGuardada(); 
        User3.IngresaPartida();
           
           }
           else if (op==2){
            SeleccionPersonaje Edinson = new SeleccionPersonaje ();
        Edinson.Seleccion();
         
        PartidaNueva User2= new PartidaNueva (); 
        User2.NuevaPartida();
           
           
           }
             System.out.println("ENTRANDO AL JUEGO.");
           }
        
        
        System.out.println("F");
       
        
        
        
       
        
//        Scanner teclado= new Scanner (System.in);
//        
        
//      
//      
//        
//        
//       Registro User1 = new Registro ("Jose","Acosta", "jose21365@gmail.com");
//            System.out.println("Creando una nueva partida...");
//       PartidaNueva User= new PartidaNueva("Partida1","Facil","Offline","Jose123");     
//   SeleccionPersonaje Edinson = new SeleccionPersonaje ("Jency"); 
//        }
//      
//        InicioSesion User1= new InicioSesion ("jose21365@gmail.com","jose123");
//            
//            if (op==1){
//             PartidaNueva User= new PartidaNueva("Partida1","Facil","Offline","Jose123"); 
//             SeleccionPersonaje Edinson = new SeleccionPersonaje ("David");
//            }
//            
//            else if (op==2){
//            PartidaGuardada I= new PartidaGuardada ("Partida1","Jose123"); 
//          
//            }
//            
//        }
//        
      
        
//        
         
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
