/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
import java.util.*;
/**
 *
 * @author julia
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] participantes = {19, 22, 21, 25, 32, 38, 16, 31, 30, 26, 19, 17, 23};
        //reporte(participantes); // llama el metodo
        System.out.println(Arrays.toString(reporte(participantes))); //imprimir los valores
           
    }
    public static int [] reporte(int [] participantes){
        int numeroMenor = 999999999;
        int numeroMayor = 0;
        for (int numero:participantes){
            numeroMenor = Math.min(numeroMenor, numero);
            numeroMayor = Math.max(numeroMayor, numero);
        }
        /*
        System.out.println(participantes.length);
        resultados[0]=participantes.length;
        System.out.println(numeroMenor);
        resultados[1]=numeroMenor;
        System.out.println(numeroMayor);
        resultados[2]=numeroMayor;
        */
        return new int[] {participantes.length, numeroMenor, numeroMayor};
    }
    
}
