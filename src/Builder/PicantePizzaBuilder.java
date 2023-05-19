/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tefip
 */
public class PicantePizzaBuilder  extends PizzaBuilder {
    @Override
    public void buildMasa() { 
        pizza.setMasa("cocida"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("picante"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("pimienta+salchichón"); 
    }
    
}
