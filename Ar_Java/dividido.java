/*
public class dividido {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 20;
        persona1.direccion = "Calle 1";
        mostrarInformacion(persona1);
        
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.edad = 30;
        persona2.direccion = "Calle 2";
        mostrarInformacion(persona2);
    }

    public static void mostrarInformacion(Persona persona) {
        System.out.println(persona.nombre);
        System.out.println(persona.edad);
        System.out.println(persona.direccion);
    }
    
}
*/
public class dividido {

    public static void mostrarNombre(Persona persona) {
        System.out.println(persona.nombre);
    }

    public static void mostrarEdad(Persona persona) {
        System.out.println(persona.edad);
    }

    public static void mostrarDireccion(Persona persona) {
        System.out.println(persona.direccion);
    }
}