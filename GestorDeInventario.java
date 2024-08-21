/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO 2022
 */
class GestorDeInventario {
    private List<productos> productos;
    private List<Categoria> categorias;
    private List<Proveedor> proveedores;

    public GestorDeInventario() {
        this.productos = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    public void agregarProducto(productos producto, Categoria categoria, Proveedor proveedor) {
        productos.add(producto);
        categoria.agregarProducto(producto);
        proveedor.agregarProducto(producto);
    }

    public double calcularPrecioTotal(CalculadorDePrecio calculador) {
        return calculador.calcularPrecioTotal(productos);
    }

    public void agregarCategoría(Categoria categoría) {
        categorias.add(categoría);
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    void agregarCategoria(Categoria electronica) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
