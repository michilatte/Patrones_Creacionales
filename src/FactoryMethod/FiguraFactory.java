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
public class FiguraFactory {
    public static Figura crearFigura(TipoFigura tipoFigura) {
        if (null == tipoFigura) {
            return new Circulo();
        } else switch (tipoFigura) {
            case TRIANGULO:
                return new Triangulo();
            case RECTANGULO:
                return new Rectangulo();
            default:
                return new Circulo();
        }
    }
}
