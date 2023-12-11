/*
public class drivercontrollermanager {
    public static void main(String[] args) {
        PersonaManager personaManager = new PersonaManager();
        personaManager.crearPersona();
        personaManager.actualizarPersona();
        personaManager.eliminarPersona();

        ProductoController productoController = new ProductoController();
        productoController.crearProducto();
        productoController.actualizarProducto();
        productoController.eliminarProducto();

        OrdenDriver ordenDriver = new OrdenDriver();
        ordenDriver.crearOrden();
        ordenDriver.actualizarOrden();
        ordenDriver.eliminarOrden();
    }

    public static class PersonaManager {
        public void crearPersona() {
        }

        public void actualizarPersona() {
        }

        public void eliminarPersona() {
        }
    }

    public static class ProductoController {
        public void crearProducto() {
        }

        public void actualizarProducto() {
        }

        public void eliminarProducto() {
        }
    }

    public static class OrdenDriver {
        public void crearOrden() {
        }

        public void actualizarOrden() {
        }

        public void eliminarOrden() {
        }
    }
}
*/
public class drivercontrollermanager {

    public static void main(String[] args) {
        GestorPersonas gestorPersonas = new GestorPersonas();
        gestorPersonas.crearPersona();
        gestorPersonas.actualizarPersona();
        gestorPersonas.eliminarPersona();

        GestorProductos gestorProductos = new GestorProductos();
        gestorProductos.crearProducto();
        gestorProductos.actualizarProducto();
        gestorProductos.eliminarProducto();

        GestorOrdenes gestorOrdenes = new GestorOrdenes();
        gestorOrdenes.crearOrden();
        gestorOrdenes.actualizarOrden();
        gestorOrdenes.eliminarOrden();
    }

    public static class GestorPersonas {
        public void crearPersona() {
        }

        public void actualizarPersona() {
        }

        public void eliminarPersona() {
        }
    }

    public static class GestorProductos {
        public void crearProducto() {
        }

        public void actualizarProducto() {
        }

        public void eliminarProducto() {
        }
    }

    public static class GestorOrdenes {
        public void crearOrden() {
        }

        public void actualizarOrden() {
        }

        public void eliminarOrden() {
        }
    }
}
