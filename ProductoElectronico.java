/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author USUARIO 2022
 */
public class ProductoElectronico extends productos {
    private int garantia; // en meses

    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    @Override
    public String getDetalles() {
        return "Electronico: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Garantia: " + garantia + " meses";
    }
}