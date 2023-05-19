/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tefip
 */
public class HawaiPizzaBuilder extends PizzaBuilder {
   
    @Override
    public void buildMasa() { 
        pizza.setMasa("suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("dulce"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("chorizo+alcachofas"); 
    }
    
    
}
