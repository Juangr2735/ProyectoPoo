package proyecto;

import java.util.Scanner;
public class InicioSesion {
    Scanner teclado=new Scanner (System.in);
    private String Correo;
    private String Contraseña; 
    
    public InicioSesion (String Correo,String Contraseña){
    this.Correo=Correo;
    this.Contraseña=Contraseña; 
    
    }
    public InicioSesion(){
   
    }
    public void IniciarSesion(){
        
        boolean salir= false;
        
        String correo1 ="joseacosta@gmail.com";
        String contraseña1= "jose123";
        
        System.out.print("                        Digite su correo: ");
       
        Correo= teclado.next();
        System.out.print("                        Digite su contraseña: ");
        Contraseña= teclado.next();
    if (correo1.equalsIgnoreCase(Correo) && contraseña1.equals(Contraseña )){
        System.out.println("                     Correo Y Contraseña Correctos BIENVENIDOS");
        System.out.println();
    
    }
    else {
        System.out.println("              Correo y/o Contraseña Incorrectos, ACCESO DENEGADO." );
        salir=true;
    }
    
    }
    
}
