/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author USUARIO 2022
 */
import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private List<productos> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(productos producto) {
        productos.add(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public List<productos> getProductos() {
        return productos;
    }
}
