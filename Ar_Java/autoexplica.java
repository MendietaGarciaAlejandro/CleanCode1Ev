public class autoexplica {
    /*
    public void calcularSuma(int a, int b) {
        // Calcula la suma de dos números
        int suma = a + b;

        // Si la suma es mayor que 100, se imprime un mensaje de error
        if (suma > 100) {
            System.out.println("La suma es mayor que 100");
        }
    }
    */
    public void calcularSuma(int a, int b) {
        // La suma de dos números no debe ser mayor que 100
        int suma = a + b;
        if (suma > 100) {
            throw new IllegalArgumentException("La suma es mayor que 100");
        }
    }
}
