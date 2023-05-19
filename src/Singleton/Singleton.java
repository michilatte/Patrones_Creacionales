/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author USUARIO
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            
        //PRIMERO
//        SoyUnico nom = SoyUnico.getSingletonInstance("Estefania");
//        SoyUnico ape = SoyUnico.getSingletonInstance("Padilla");
//        
//        // nom y ape son referencias a un único objeto de la clase SoyUnico
//        System.out.println(nom.getNombre());
//        System.out.println(ape.getNombre());
//        
//        
        

       //SEGUNDO
         SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");

        try{
            SoyUnico richard = ricardo.clone();
            System.out.println(richard.getNombre());
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    } 
    
}
