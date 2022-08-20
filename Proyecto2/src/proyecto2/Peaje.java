/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.util.Arrays;


/**
 *
 * @author julia
 */
public class Peaje {

    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    private String [] filaCoches;
    private String [] cochesFlyPass;
    private boolean estadoPeaje = true;
    private int cantidadCochesAtendidos = 1;
    private int cocheEnAtencion = 0;
    
    
    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:
    /*
    public Peaje(String[] filaCoches) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
    }*/

    public Peaje(String[] filaCoches) {
        this.filaCoches = filaCoches;
        this.cochesFlyPass = new String[filaCoches.length];
        for (int i = 0; i < filaCoches.length; i++) {
            cochesFlyPass[i] = " ";
        }
        
    }

    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:

    public String[] getFilaCoches() {
        return filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }

    

        
    public void proximoCoche(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if (estadoPeaje){
        this.cantidadCochesAtendidos++;
        this.cocheEnAtencion++;
        }
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }
    
    public void cambiarEstadoPeaje(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if (this.estadoPeaje = true){
            this.estadoPeaje = false;
        }if (this.estadoPeaje = false){
            this.estadoPeaje = true;
        }
    }
    
    @Override
    public String toString() {
        return "Peaje{" + "filaCoches=" + Arrays.toString(filaCoches) + ", cochesFlyPass=" + Arrays.toString(cochesFlyPass) + ", estadoPeaje=" + estadoPeaje + ", cantidadCochesAtendidos=" + cantidadCochesAtendidos + ", cocheEnAtencion=" + cocheEnAtencion + '}';
    }

}
/* Arrays.toString(filaCoches) */