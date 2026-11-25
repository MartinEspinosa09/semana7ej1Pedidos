public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Camiseta Básica", 18.50);
        Producto p2 = new Producto("Gorra Urbana", 14.00);
        Producto p3 = new Producto("Mochila Tech", 45.00);
        Producto p4 = new Producto("Botella Térmica", 12.25);

        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1, 2);
        pedido.agregarProducto(p2, 1);
        pedido.agregarProducto(p3, 1);
        pedido.agregarProducto(p4, 3);

        System.out.println("=== RESUMEN INICIAL ===");
        System.out.println(pedido.mostrarResumen());

        System.out.println("\n=== PRUEBA TOTAL ===");
        System.out.printf("Total: $%.2f%n", pedido.calcularTotal());

        System.out.println("\n=== PRUEBA SIZE ===");
        System.out.println("Cantidad de detalles (size): " + pedido.cantidadDetalles());

        System.out.println("\n=== PRUEBA ELIMINAR DETALLE VÁLIDO (índice 1) ===");
        boolean eliminadoValido = pedido.eliminarDetalle(1);
        System.out.println("Eliminado índice 1: " + eliminadoValido);
        System.out.println("Cantidad de detalles actual: " + pedido.cantidadDetalles());
        System.out.printf("Nuevo total: $%.2f%n", pedido.calcularTotal());

        System.out.println("\n=== PRUEBA ELIMINAR DETALLE INVÁLIDO (índice 20) ===");
        boolean eliminadoInvalido = pedido.eliminarDetalle(20);
        System.out.println("Eliminado índice 20: " + eliminadoInvalido);

        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.println(pedido.mostrarResumen());
    }
}