/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

/**
 *
 * @author USUARIO 2022
 */
import java.time.LocalDate;

public class Inventario {
    public static void main(String[] args) {
        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Crear categorías
        Categoria electronica = new Categoria("Electronica");
        Categoria alimentos = new Categoria("Alimentos");

        // Crear productos
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1500, 5, proveedor1, 24);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 5, 100, proveedor2, LocalDate.of(2024, 12, 31));

        // Mostrar detalles de los productos
        System.out.println(laptop.getDetalles());
        System.out.println(manzana.getDetalles());

        // Crear gestor de inventario y agregar productos
        GestorDeInventario gestorDeInventario = new GestorDeInventario();
        gestorDeInventario.agregarProducto(laptop, electronica, proveedor1);
        gestorDeInventario.agregarProducto(manzana, alimentos, proveedor2);

        // Calcular y mostrar el precio total
        CalculadorDePrecio calculadorSinDescuento = new CalculadorDePrecioSinDescuento();
        System.out.println("Precio total sin descuento: " + gestorDeInventario.calcularPrecioTotal(calculadorSinDescuento));

        CalculadorDePrecio calculadorConDescuento = new CalculadorDePrecioConDescuento(10);  // 10% de descuento
        System.out.println("Precio total con descuento: " + gestorDeInventario.calcularPrecioTotal(calculadorConDescuento));
    }
}
