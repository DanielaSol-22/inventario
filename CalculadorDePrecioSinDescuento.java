/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.List;

/**
 *
 * @author USUARIO 2022
 */
class CalculadorDePrecioSinDescuento implements CalculadorDePrecio {

    @Override
    public double calcularPrecioTotal(List<productos> productos) {
        double total = 0;
        for (productos producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}

