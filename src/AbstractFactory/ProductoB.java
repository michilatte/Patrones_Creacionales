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
public interface ProductoB {

    void operacionB();
}

// Implementación concreta del producto B1
class ProductoB1 implements ProductoB {

    public void operacionB() {
        System.out.println("Operación B en ProductoB1");
    }
}

// Implementación concreta del producto B2
class ProductoB2 implements ProductoB {

    public void operacionB() {
        System.out.println("Operación B en ProductoB2");
    }
}


