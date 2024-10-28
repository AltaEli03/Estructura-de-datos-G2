
public class VentasMensuales {
    private int ventas[][];

    public VentasMensuales(int ventas[][]) {
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] <= 0) {
                    System.out.println("Los valores deben ser mayor que cero");
                }
            }
        }
        this.ventas = ventas;
    }
    

    public int[][] getVentas() {
        return ventas;
    }

    public void setVentas(int[][] ventas) {
        this.ventas = ventas;
    }

    public int[] totalVentasSucursal() {
        int[] totVentas = new int[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                totVentas[i] += ventas[i][j];
            }
        }
        return totVentas;
    }

    public double[] promVentasSucursal() {
        double[] promedio = new double[ventas.length];
        for (int i = 0; i < promedio.length; i++) {
            double suma = 0;
            for (int j = 0; j < ventas[0].length; j++) {
                suma += ventas[i][j];
            }
            promedio[i] = suma / ventas[0].length;
        }
        return promedio;
    }

    public int VentasMasAltas() {
        int ventasMax = ventas[0][0];
        int sucursalIndex = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                if (ventas[i][j] > ventasMax) {
                    ventasMax = ventas[i][j];
                    sucursalIndex = i;
                }
            }
        }
        return sucursalIndex;
    }

    public int[] VentasMensualesSucursales() {
        int[] ventasMes = new int[ventas[0].length];
        for (int j = 0; j < ventas[0].length; j++) {
            int contador = 0;
            for (int i = 0; i < ventas.length; i++) {
                contador += ventas[i][j];
            }
            ventasMes[j] = contador;
        }
        return ventasMes;
    }

    public void imprimir() {
        System.out.println("Total de ventas por sucursal:");
        int[] totVentas = totalVentasSucursal();
        for (int i = 0; i < totVentas.length; i++) {
            System.out.println("Sucursal Numero " + (i + 1) + " = " + totVentas[i]);
        }
        
        System.out.println("\nPromedio de ventas por sucursal:");
        double[] promVentas = promVentasSucursal();
        for (int j = 0; j < promVentas.length; j++) {
            System.out.println("Sucursal Numero " + (j + 1) + ": " + promVentas[j]);
        }

        System.out.println("\nSucursal con más ventas en total: Sucursal " + (VentasMasAltas() + 1));

        System.out.println("\nVentas mensuales por sucursal:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Sucursal " + (i + 1) + ":");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Mes Numero " + (j + 1) + ": " + ventas[i][j]);
            }
        }
    }

}
