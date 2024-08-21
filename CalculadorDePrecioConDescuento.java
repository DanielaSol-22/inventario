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
class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private double porcentajeDescuento;

    public CalculadorDePrecioConDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioTotal(List<productos> productos) {
        double total = 0;
        for (productos producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total * (1 - porcentajeDescuento / 100);
    }
}

