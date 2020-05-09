package proyecto;

import java.util.Scanner;
public class InicioSesion {
    Scanner teclado=new Scanner (System.in);
    private String Correo;
    private String Contraseña; 
    
    
    public InicioSesion (String Correo,String Contraseña){
    this.Correo=Correo;
    this.Contraseña=Contraseña; 
    
//    ValidarInicio();
   
    }
    public InicioSesion(){
   
    }
//      if (Nombre1.equals(P)) {
    public void IniciarSesion(){
        
        boolean salir= false;
        
        String correo1 ="joseAcosta@gmail.com";
        String contraseña1= "jose123";
        
        System.out.print("Digite su correo: ");
        //"jose21365@gmail.com";
        Correo= teclado.next();
        System.out.print("Digite su contraseña: ");
        //"jose123";
        Contraseña= teclado.next();
    if (correo1.equals(Correo) && contraseña1.equals(Contraseña )){
        System.out.println("Correo Y Contraseña Correctos BIENVENIDOS");
    
    }
    else {
        System.out.println("Correo y/o Contraseña Incorrectos, ACCESO DENEGADO." );
        salir=true;
    }
    
//    else if (Correo=="jose21365@gmail.com"){
//        System.out.println("Correo correcto");
//    }
    
//   if (contraseña1.equals(Contraseña)){
//       System.out.println("contraseña Correcta BIENVENIDO");
//        System.out.println();
//   }
//   else{
//       System.out.println("Contraseña INCORRECTA,Acceso Denegado");
//        System.out.println();
//   }
//   else if (Contraseña== "jose123"){
//       System.out.println("contraseña Correcta BIENVENIDO");
//   }
    
    }
    
    
    
}
