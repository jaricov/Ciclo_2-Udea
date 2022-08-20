/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3;

import java.util.Arrays;



/**
 *
 * @author julia
 */
public class Tripulante extends UsuarioMoodle{
    //Atributos
    private double [] calificaciones;
    private boolean [] entregas;
    
    //Constructor
    /*
    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        
    }*/

    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones = new double[n];
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones [i] = 0;           
        }
        this.entregas = new boolean[n];
        for (int i = 0; i < entregas.length; i++) {
            entregas [i] = false;
        }
    }
    
    //Getter del atributo calificaciones

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
    
    
    //Método
    public void resolverReto(int retoAEntregar){
        this.entregas [retoAEntregar] = true;
    }
    /*
    @Override
    public String toString() {
        return "Tripulante{" + "calificaciones=" + Arrays.toString(calificaciones) + ", entregas=" + Arrays.toString(entregas) + '}';
    }*/
    
    
}
