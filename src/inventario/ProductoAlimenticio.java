package inventario;

public class ProductoAlimenticio extends Producto{
    private String fechaVencimiento; 

    public ProductoAlimenticio(int id, String nombre, double precio, int stockInicial, String fechaVencimiento) {
        super(id, nombre, precio, stockInicial);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    
    @Override
    public String mostrarDetalle() {
        return super.mostrarDetalle() + 
               ", Vencimiento: " + this.fechaVencimiento;
    }
}

