/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto4;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Solution{
    public static Object [] reporte(ArrayList <corredor> carrera){
        //ESCRIBA LA LÓGICA DE SU PROPUESTA
        //DE SOLUCIÓN. NO OLVIDE INDICAR EL
        //OBJETO QUE ESTA VA A RETORNAR
        double tiempoTotal = 0;
        double tiempoGanador = Double.MAX_VALUE;
        String ganador = "";
        double tiempoPerdedor = Double.MIN_VALUE;
        String perdedor = "";
        for(corredor i: carrera){
        tiempoTotal += i.getTiempoMeta();
        if (i.getTiempoMeta()< tiempoGanador){
            ganador = i.getNombreCompleto();
            tiempoGanador = i.getTiempoMeta();
            }
        if (i.getTiempoMeta()>tiempoPerdedor){
            perdedor = i.getNombreCompleto();
            tiempoPerdedor = i.getTiempoMeta();
            }
        
        }
        
        double tiempoPromedio;
        tiempoPromedio = tiempoTotal / carrera.size();
        Object [] datos = {tiempoPromedio,ganador,tiempoGanador,perdedor,tiempoPerdedor};
        return datos;
        
    }
}
