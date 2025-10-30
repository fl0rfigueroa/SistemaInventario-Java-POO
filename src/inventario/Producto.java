package inventario;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(int id, String nombre, double precio, int stockInicial) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = stockInicial;
    }

    /**
     * Vende una cantidad del producto, validando el stock.
     */
    public void vender(int cantidad) {
        if (cantidad <= this.cantidadStock && cantidad > 0) {
            this.cantidadStock -= cantidad;
            System.out.println("Venta de " + cantidad + " unidades de " + this.nombre + " realizada.");
        } else {
            System.out.println("Error: No hay suficiente stock de " + this.nombre + ".");
        }
    }

    /**
     * Agrega stock al producto.
     */
    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            this.cantidadStock += cantidad;
            System.out.println("Stock de " + this.nombre + " actualizado: " + this.cantidadStock);
        }
    }


    public String mostrarDetalle() {
        return "ID: " + this.id + 
               ", Nombre: " + this.nombre + 
               ", Precio: $" + this.precio + 
               ", Stock: " + this.cantidadStock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    
}