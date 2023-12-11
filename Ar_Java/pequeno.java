/*
public class pequeno {

    public static void main(String[] args) {
        calcularSueldo(new Empleado("Juan", "Pérez", 1000));
        calcularSueldo(new Empleado("Pedro", "García", 2000));
        calcularSueldo(new Empleado("María", "López", 3000));
    }

    public static void calcularSueldo(Empleado empleado) {
        double sueldoBase = empleado.getSueldoBase();
        double plus = empleado.getAntigüedad() * 100;
        double sueldoBruto = sueldoBase + plus;
        double impuestos = sueldoBruto * 0.21;
        double sueldoNeto = sueldoBruto - impuestos;

        System.out.println("El sueldo de " + empleado.getNombre() + " es " + sueldoNeto);
    }
}
*/
public class pequeno {

    public static void main(String[] args) {
        calcularSueldo(new Empleado("Juan", "Pérez", 1000));
        calcularSueldo(new Empleado("Pedro", "García", 2000));
        calcularSueldo(new Empleado("María", "López", 3000));
    }

    public static void calcularSueldo(Empleado empleado) {
        double sueldoNeto = calcularSueldoNeto(empleado);

        System.out.println("El sueldo de " + empleado.getNombre() + " es " + sueldoNeto);
    }

    private static double calcularSueldoNeto(Empleado empleado) {
        double sueldoBase = empleado.getSueldoBase();
        double plus = empleado.getAntigüedad() * 100;
        double sueldoBruto = sueldoBase + plus;
        double impuestos = sueldoBruto * 0.21;

        return sueldoBruto - impuestos;
    }
}
