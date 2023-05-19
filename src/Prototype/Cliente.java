/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author jonny
 */
public class Cliente {

    private Clonable prototipo;

    public Cliente(Clonable prototipo) {
        this.prototipo = prototipo;
    }

    public Clonable crearProducto() {
        return prototipo.clonar();
    }

    public static void main(String[] args) {
        Producto productoOriginal = new Producto("Producto Original");
        Cliente cliente = new Cliente(productoOriginal);

        Clonable productoClonado = cliente.crearProducto();
        System.out.println("Producto clonado: " + ((Producto) productoClonado).getNombre());

        ((Producto) productoClonado).setNombre("Producto Clonado");
        System.out.println("Producto original: " + productoOriginal.getNombre());
        System.out.println("Producto clonado modificado: " + ((Producto) productoClonado).getNombre());
    }
}
