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
public class Formador extends UsuarioMoodle{
    //Atributos
    private String escalafon;
    
    
    //Constructor
    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }
    
    //Getter del atributo escalafon
    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
     
    //Método calificar
    public void calificar(Tripulante tripulanteACalificar, int k){
        if(tripulanteACalificar.getEntregas()[k] == true){
            tripulanteACalificar.getCalificaciones()[k] = 5;
        }
    }
    
}
