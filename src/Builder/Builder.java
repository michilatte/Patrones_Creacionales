/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author USUARIO
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Cocina cocina = new Cocina(); // Director
          HawaiPizzaBuilder haw = new HawaiPizzaBuilder();

        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();
 
//        cocina.setPizzaBuilder(hawaiPizzaBuilder);
//        System.out.println("EL CLIENTE PREFIERE: HawaiPizza");

        cocina.setPizzaBuilder(picantePizzaBuilder);
        System.out.println("EL CLIENTE PREFIERE: Pizza Picante");

        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();
    }
    }
    

