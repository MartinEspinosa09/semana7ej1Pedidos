import java.util.ArrayList;

public class Pedido {
    private ArrayList<DetallePedido> detalles;

    public Pedido() {
        this.detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto != null && cantidad > 0) {
            DetallePedido detalle = new DetallePedido(producto, cantidad);
            detalles.add(detalle);
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (DetallePedido detalle : detalles) {
            if (detalle != null) {
                total += detalle.calcularSubtotal();
            }
        }
        return total;
    }

    public int cantidadDetalles() {
        return detalles.size();
    }

    public boolean eliminarDetalle(int indice) {
        if (indice < 0 || indice >= detalles.size()) {
            return false;
        }
        detalles.remove(indice);
        return true;
    }

    public String mostrarResumen() {
        if (detalles.isEmpty()) {
            return "El pedido no tiene detalles.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < detalles.size(); i++) {
            sb.append(i).append(". ").append(detalles.get(i).describir());
            if (i < detalles.size() - 1) {
                sb.append("\n");
            }
        }
        sb.append(String.format("%nTotal del pedido: $%.2f", calcularTotal()));
        return sb.toString();
    }
}