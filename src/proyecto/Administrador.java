package proyecto;

import java.util.Random;
public class Administrador extends Registro {
    String Nombre; 
    String Apellido; 
    int Codigo;
    String Rol; 
     
    public Administrador (String Nombre,String Apellido,int Codigo,String Rol){
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.Codigo=Codigo;
   this.Rol=Rol;
    
    }
    
    public void AdminAsignado (){
    int Numero=0; 
     Random rand = new Random(); 
        Numero= rand.nextInt(500); 
        
        System.out.println("         El administrador "+Nombre+ " "+Apellido+" con codigo codigo "+Codigo+ " y el rol de: "+Rol );
        System.out.println("                            le ha asignado su id de la cuenta numero: "+Numero);
        System.out.println();
    }
    
}
