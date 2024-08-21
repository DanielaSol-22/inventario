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
class CalculadorPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<productos> productos) {
        double total = 0;
        for (productos producto : productos) {
            if (categoria.getProductos().contains(producto)) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return (int) total;
    }
}

