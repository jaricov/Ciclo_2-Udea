/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto3;

/**
 *
 * @author julia
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Tripulante John = new Tripulante("John DOe","1037654354","123456789","john.doe@udea.edu.co","Soy una persona con muchas ganas de aprender",5);
    Formador Jane = new Formador("3D","Jane Di","1038654355","987654321","jane.di@udea.edu.co","Me apasiona enseñar");
    
    John.resolverReto(1);
    John.resolverReto(2);
    System.out.println(John);
    
    for(int i=0;i<5;i++){
        Jane.calificar(John, i);
    }
    System.out.println(John);
    }
    
}
