package proyecto;

import java.util.Scanner;

public class Registro {

    Scanner teclado = new Scanner(System.in);
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Contraseña;

    public Registro(String Nombre, String Apellido, String Correo, String Contraseña) {

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
//       System.out.println("USUARIO REGISTRADO");
    }

    public Registro() {

    }

    public void Registrar() {

        System.out.print("Digite su Nombre: ");
        Nombre = teclado.next();
        System.out.print("Digite su apellido: ");
        Apellido = teclado.next();
       
        
        System.out.print("Digite su correo: ");
        //"jose21365@gmail.com";
        Correo = teclado.next();
        System.out.print("Digite su Contraseña: ");
        //"jose123";
        Contraseña = teclado.next();
        System.out.println("Los datos del registro son: \nNombre: " + Nombre + "\nApellido: " + Apellido + "\nCorreo: " + Correo + "\nContraseña: "+ Contraseña);
        System.out.println("USUARIO REGISTRADO");
        System.out.println();
        
        
    }

}
