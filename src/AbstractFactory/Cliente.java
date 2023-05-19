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
public class Cliente {

    private ProductoA productoA;
    private ProductoB productoB;

    public Cliente(FabricaAbstracta fabrica) {
        productoA = fabrica.crearProductoA();
        productoB = fabrica.crearProductoB();
    }

    public void ejecutarOperaciones() {
        productoA.operacionA();
        productoB.operacionB();
    }

    public static void main(String[] args) {
        FabricaAbstracta fabrica1 = new FabricaConcreta1();
        Cliente cliente1 = new Cliente(fabrica1);
        cliente1.ejecutarOperaciones();

        FabricaAbstracta fabrica2 = new FabricaConcreta2();
        Cliente cliente2 = new Cliente(fabrica2);
        cliente2.ejecutarOperaciones();
    }
}
