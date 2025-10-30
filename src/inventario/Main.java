package inventario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Inventario...");

        Inventario miInventario = new Inventario();

        Producto laptop = new ProductoElectronico(101, "Laptop Gamer", 1500.00, 10, 24);
        Producto manzanas = new ProductoAlimenticio(201, "Manzana Roja", 2.50, 100, "30-11-2025");
        Producto teclado = new ProductoElectronico(102, "Teclado Mecánico", 150.00, 30, 12);

        // Agregamos los productos al inventario
        miInventario.agregarProducto(laptop);
        miInventario.agregarProducto(manzanas);
        miInventario.agregarProducto(teclado);

        // Mostramos el inventario 
        miInventario.mostrarInventario();

        // Probamos la lógica de negocio
        System.out.println("\n--- Realizando Venta ---");
        Producto productoAVender = miInventario.buscarProducto(101); 
        if (productoAVender != null) {
            productoAVender.vender(3); 
        }

        System.out.println("\n--- Stock Actualizado ---");
        miInventario.mostrarInventario();

        // 6. Intentamos vender más de lo que hay
        System.out.println("\n--- Venta Fallida (Stock) ---");
        if (productoAVender != null) {
            productoAVender.vender(20); // Intentamos vender 20 (solo quedan 7)
        }
    }
}