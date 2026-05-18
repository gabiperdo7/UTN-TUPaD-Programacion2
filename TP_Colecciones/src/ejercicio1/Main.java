
package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz", 1200, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares", 2500, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3000, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 8500, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Mouse", 2000, 40, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("LISTADO DE PRODUCTOS:");
        inventario.listarProductos();

        System.out.println("\nBUSCAR PRODUCTO POR ID:");
        Producto buscado = inventario.buscarProductoPorId("P002");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        System.out.println("\nPRODUCTOS DE CATEGORIA ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\nELIMINAR PRODUCTO P003:");
        inventario.eliminarProducto("P003");

        System.out.println("\nPRODUCTOS RESTANTES:");
        inventario.listarProductos();

        System.out.println("\nACTUALIZAR STOCK DE P001:");
        inventario.actualizarStock("P001", 50);

        System.out.println("\nTOTAL DE STOCK:");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println("\nPRODUCTO CON MAYOR STOCK:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        }

        System.out.println("\nPRODUCTOS ENTRE $1000 Y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\nCATEGORIAS DISPONIBLES:");
        inventario.mostrarCategoriasDisponibles();
    }
}