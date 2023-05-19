/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author jonny
 */
public interface ProductoA {

    void operacionA();
}

// Implementación concreta del producto A1
class ProductoA1 implements ProductoA {

    public void operacionA() {
        System.out.println("Operación A en ProductoA1");
    }
}
// Implementación concreta del producto A2

class ProductoA2 implements ProductoA {

    public void operacionA() {
        System.out.println("Operación A en ProductoA2");
    }
}
