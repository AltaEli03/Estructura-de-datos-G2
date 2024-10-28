import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 3;
        OrdenamientoMatrices obj1 = new OrdenamientoMatrices(solicitarValores(filas, columnas));
        obj1.imprimir();

        obj1.ordenarBubbleAsc();
    }

    public static int[][] solicitarValores(int fila, int columna) {
        int[][] x = new int[fila][columna];
        int fila1 = 0;
        while (fila1 < x.length) {
            int columna1 = 0;
            while (columna1 < x[0].length) {
                x[fila1][columna1] = Integer.parseInt(
                        JOptionPane.showInputDialog("Introduces el valor " + "(" + (fila1) + "," + (columna1) + ")"));
                columna1++;
            }
            fila1++;
        }
        return x;
    }
}
