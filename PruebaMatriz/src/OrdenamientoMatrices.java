public class OrdenamientoMatrices {
    private int[][] matriz;

    public OrdenamientoMatrices(int[][] matriz) {
        this.matriz = new int[matriz.length][matriz[0].length];
        this.setMatriz(matriz);
    }

    public void setMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                this.matriz[i][j] = matriz[i][j];
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void ordenarBubbleAsc() {
        System.out.println();
        crearVectorMatriz();
    }

    private void crearVectorMatriz() {
        int tam = this.matriz.length * this.matriz[0].length;
        int[] vector = new int[tam];
        int aux = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                vector[aux] = this.matriz[i][j];
                aux++;
            }
        }

        vector = Sort.bubbleSortAsc(vector);
        imprimirVector(vector);
    }

    // private void CrearMatrizOrdenada () {

    // }

    private void imprimirVector(int[] vector) {
        for (int item : vector) {
            System.out.print(item + "| ");
        }
    }

    public void imprimir() {
        for (int i = 0; i < this.matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < this.matriz[0].length; j++) {
                System.out.print(this.matriz[i][j] + " |");
            }
            System.out.println();
        }
    }
}
