package inventario;

public class ProductoElectronico extends Producto{

    private int mesesGarantia;

    public ProductoElectronico(int id, String nombre, double precio, int stockInicial, int mesesGarantia) {
        super(id, nombre, precio, stockInicial);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    @Override
    public String mostrarDetalle() {
        return super.mostrarDetalle() + 
               ", Garantía: " + this.mesesGarantia + " meses";
    }
}
    

