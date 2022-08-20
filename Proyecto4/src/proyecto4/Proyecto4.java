/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto4;

import java.util.ArrayList;
import java.util.Arrays;
import static proyecto4.Solution.reporte;

/**
 *
 * @author julia
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList <corredor> carrera = new ArrayList<>();
    carrera.add(new corredor("Luis Gomez", "12", 1.68, 20, 22));
    carrera.add(new corredor("Juan Corredor", "28", 1.75, 24, 21));
    carrera.add(new corredor("Carlos Perez", "19", 1.71, 28, 24));
    carrera.add(new corredor("Maria Cadavid", "13", 1.80, 32, 22));
   
    Object retorno[] = reporte(carrera);
    System.out.println(Arrays.toString(retorno));
    }
    
}
