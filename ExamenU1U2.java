/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ExamenU1U2 = new Scanner (System.in); 
        System.out.println("Bienvenido!");
        System.out.println("Ingrese el nombre del primer videojuego: ");
        String videojuego1 = ExamenU1U2.nextLine();
        System.out.println("Ingrese el precio del primer videojuego: ");
        double videojuego1pre = ExamenU1U2.nextDouble();
        System.out.println("Ingrese el nombre del segundo videojuego: ");
        ExamenU1U2.nextLine();
        String videojuego2 = ExamenU1U2.nextLine();
        System.out.println("Ingrese el precio del segundo videojuego: ");
        double videojuego2pre = ExamenU1U2.nextDouble();
        System.out.println("Ingrese el nombre del tercer videojuego: ");
        ExamenU1U2.nextLine();
        String videojuego3 = ExamenU1U2.nextLine();
        System.out.println("Ingrese el precio del tercer videojuego: ");
        double videojuego3pre = ExamenU1U2.nextDouble();
        
        double Descuento1 = videojuego1pre - (videojuego1pre * 30)/100;
        System.out.println("El precio final del primer videojuego es: " + Descuento1);
        double Descuento2 = videojuego2pre - (videojuego2pre * 65)/100;
        System.out.println("El precio final del segundo videojuego es: " + Descuento2);
        double Descuento3 = videojuego3pre - (videojuego3pre * 15)/100;
        System.out.println("El precio final del tercer videojuego es: " + Descuento3);
        ExamenU1U2.close();
        
        
        
        
    }
    
}
