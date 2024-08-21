/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author USUARIO 2022
 */
import java.util.List;

public class GestorDeDescuento {
    private Descuento descuento;

    public GestorDeDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public double aplicarDescuento(List<productos> productos) {
        double total = 0;
        for (productos producto : productos) {
            total += descuento.aplicarDescuento(producto.getPrecio()) * producto.getCantidad();
        }
        return total;
    }
}
