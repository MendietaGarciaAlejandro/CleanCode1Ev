public class switch_when {
    /*
    public static String saludar(String nombre) {
        switch (nombre) {
            case "Juan":
                return "Hola, Juan";
            case "María":
                return "Hola, María";
            default:
                return "Hola, desconocido";
        }
    }
    */

    public static String saludar(String nombre) {
        if (nombre.equals("Juan")) {
            return "Hola, Juan";
        } else if (nombre.equals("María")) {
            return "Hola, María";
        } else {
            return "Hola, desconocido";
        }
    }
    
}
