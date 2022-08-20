/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

/**
 *
 * @author julia
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] filaCoches = {"FNC901","RBP250","TPS706","ITN503","RSP845"};
        
        Peaje taquillaPeaje = new Peaje(filaCoches);
        System.out.println(taquillaPeaje);
        
        taquillaPeaje.cambiarEstadoPeaje();
        System.out.println(taquillaPeaje);
    }
    
}
