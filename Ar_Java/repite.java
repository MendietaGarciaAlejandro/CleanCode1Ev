import java.util.List;

public class repite {
    /*
    public void imprimirListado(List<String> listado) {
        for (String elemento : listado) {
            System.out.println(elemento);
        }
    }

    public void imprimirListadoConEspacios(List<String> listado) {
        for (String elemento : listado) {
            System.out.println(" " + elemento);
        }
    }
    */
    public void imprimirListado(List<String> listado) {
        imprimir(listado, false);
    }

    public void imprimirListadoConEspacios(List<String> listado) {
        imprimir(listado, true);
    }

    private void imprimir(List<String> listado, boolean conEspacio) {
        for (String elemento : listado) {
            if (conEspacio) {
                System.out.println(" " + elemento);
            } else {
                System.out.println(elemento);
            }
        }
    }
}
