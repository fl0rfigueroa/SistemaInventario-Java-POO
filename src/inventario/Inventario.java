package inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la lista.
     */
    public void agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
        System.out.println("Producto '" + producto.getNombre() + "' agregado al inventario.");
    }

    /**
     * Busca un producto por su ID.
     */
    public Producto buscarProducto(int id) {
        for (Producto p : this.listaProductos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // No se encontró
    }

    
    public void mostrarInventario() {
        System.out.println("--- INVENTARIO ACTUAL ---");
        if (listaProductos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        for (Producto p : this.listaProductos) {
            System.out.println(p.mostrarDetalle());
        }
        System.out.println("-------------------------");
    }
}