public class argumentos {
    /*
    public static String sumarYMultiplicar(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int suma = numero1 + numero2 + numero3 + numero4;
        int producto = suma * numero5;
        return String.valueOf(producto);
    }
    */
    public static String calcular(int[] numeros) {
        int suma = 0;
        int producto = 1;
        for (int numero : numeros) {
            suma += numero;
            producto *= suma;
        }
        return String.valueOf(producto);
    }
}
