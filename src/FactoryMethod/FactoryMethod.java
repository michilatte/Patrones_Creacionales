/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author USUARIO
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura figura = FiguraFactory.crearFigura(TipoFigura.TRIANGULO);
        Triangulo triangulo = (Triangulo) figura;
        triangulo.setBase(5);
        triangulo.setAltura(3);
        System.out.println("Triángulo:");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Área: " + figura.calcularArea());

        System.out.println();

        figura = FiguraFactory.crearFigura(TipoFigura.RECTANGULO);
        Rectangulo rectangulo = (Rectangulo) figura;
        rectangulo.setAncho(7);
        rectangulo.setAlto(10);
        System.out.println("Rectángulo:");
        System.out.println("Base: " + rectangulo.getAncho());
        System.out.println("Altura: " + rectangulo.getAlto());
        System.out.println("Área: " + figura.calcularArea());

        System.out.println();

        figura = FiguraFactory.crearFigura(TipoFigura.CIRCULO);
        Circulo circulo = (Circulo) figura;
        circulo.setRadio(5);
        System.out.println("Círculo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Área: " + figura.calcularArea());
    }
    
}
