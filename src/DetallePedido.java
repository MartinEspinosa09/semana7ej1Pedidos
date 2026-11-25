public class DetallePedido {
    private Producto producto;
    private int cantidad;

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularSubtotal() {
        if (producto == null || cantidad <= 0) {
            return 0.0;
        }
        return producto.getPrecio() * cantidad;
    }

    public String describir() {
        String nombreProducto = (producto != null) ? producto.getNombre() : "Sin producto";
        double precioUnitario = (producto != null) ? producto.getPrecio() : 0.0;
        return String.format("%s x%d (unit: $%.2f) -> Subtotal: $%.2f",
                nombreProducto, cantidad, precioUnitario, calcularSubtotal());
    }
}