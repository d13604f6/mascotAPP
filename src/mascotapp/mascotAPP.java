/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author d1360
 */
public class mascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota();
        
        m1.apodo = "Chiquito";
        m1.nombre = leer.next();
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);
        
//    public String nombre;
//    public String apodo;
//    //conejo, gato, perro, loro, carpincho
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
        
    }
    
}
