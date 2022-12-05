/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        String contraseña;
        String intento;
        System.out.println("Ingrese su contraseña");
        Scanner leer = new Scanner(System.in);
        contraseña = leer.nextLine();
        //Este programa tiene por contraseña la palabra sistemas
        
        if(contraseña.equals("sistemas")){
            System.out.println("Contraseña correcta");
        }
        else{
            while(contraseña!="sistemas"){
                System.out.println("Contraseña incorrecta");
                System.out.println("Vuelva a ingresar la contraseña");
                intento = leer.next();
                if (intento.equals("sistemas")) {
                    System.out.println("Contraseña correcta");
                    break;
                }
            }
        }
    }
}
