import javax.swing.JOptionPane;

public class testVentas {
    public static void main(String[] args) {
        int sucursales = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de sucursales:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de meses:"));
        int[][] ventas = solicitarValores(sucursales, meses);

        VentasMensuales v1 = new VentasMensuales(ventas);
        v1.imprimir();
    }

    public static int[][] solicitarValores(int sucursales, int meses) {
        int[][] reporte = new int[sucursales][meses];
        if (sucursales > 0 && meses > 0) {
            for (int i = 0; i < sucursales; i++) {
                for (int j = 0; j < meses; j++) {
                    reporte[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce las ventas para la sucursal " + (i + 1) + " en el mes " + (j + 1) + ":"));
                }
            }
        } else {
            System.out.println("Los valores deben ser mayor que cero");
        }
        return reporte;
    }

}
