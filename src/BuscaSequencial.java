public class BuscaSequencial {
    public static int buscaSequencial(int[] lista, int elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] lista = {5, 3, 8, 6, 7};
        int elemento = 7;

        int resultado = buscaSequencial(lista, elemento);
        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}