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
public interface FabricaAbstracta {

    ProductoA crearProductoA();

    ProductoB crearProductoB();
}

// Implementación concreta de la fábrica para crear productos de la familia 1
class FabricaConcreta1 implements FabricaAbstracta {

    public ProductoA crearProductoA() {
        return new ProductoA1();
    }

    public ProductoB crearProductoB() {
        return new ProductoB1();
    }
}

// Implementación concreta de la fábrica para crear productos de la familia 2
class FabricaConcreta2 implements FabricaAbstracta {

    public ProductoA crearProductoA() {
        return new ProductoA2();
    }

    public ProductoB crearProductoB() {
        return new ProductoB2();
    }
}
