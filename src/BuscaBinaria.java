public class BuscaBinaria {
    public static int buscaBinaria(int[] lista, int elemento) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (lista[meio] == elemento) {
                return meio;
            } else if (lista[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 6, 7, 8};
        int elemento = 6;

        int resultado = buscaBinaria(lista, elemento);
        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
