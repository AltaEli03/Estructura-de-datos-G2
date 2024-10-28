public class CalEstudiantes {
    private double[][] m;

    public CalEstudiantes(double[][] m) {
        this.m = m;
    }

    public double[][] getM() {
        return m;
    }

    public void setM(double[][] m) {
        this.m = m;
    }

    public double[] promPorEstudiante() {
        double[] promedios = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            double suma = 0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            promedios[i] = suma / m[i].length;
        }
        return promedios;
    }

    public double[] promPorMateria() {
        double[] promedios = new double[m[0].length];
        for (int j = 0; j < m[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            promedios[j] = suma / m.length;
        }
        return promedios;
    }

    public int[] numEstuAprobados() {
        int[] aprobados = new int[m[0].length];
        for (int j = 0; j < m[0].length; j++) {
            int cont = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i][j] >= (double) 8.0) {
                    cont++;
                }
            }
            aprobados[j] = cont;
        }
        return aprobados;
    }

    public int[] numEstuReprobados() {
        int[] reprobados = new int[m[0].length];
        for (int j = 0; j < m[0].length; j++) {
            int cont = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i][j] < (double) 8.0) {
                    cont++;
                }
            }
            reprobados[j] = cont;
        }
        return reprobados;
    }

    public void imprimir() {
        System.out.println("Promedio por estudiante:");
        for (int i = 0; i < promPorEstudiante().length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promPorEstudiante()[i]);
        }
        System.out.println("\nPromedio por materia:");
        for (int j = 0; j < promPorMateria().length; j++) {
            System.out.println("Materia " + (j + 1) + ": " + promPorMateria()[j]);
        }
        System.out.println("\nNúmero de estudiantes aprobados por materia:");
        for (int j = 0; j < numEstuAprobados().length; j++) {
            System.out.println("Materia " + (j + 1) + ": " + numEstuAprobados()[j]);
        }
        System.out.println("\nNúmero de estudiantes reprobados por materia:");
        for (int j = 0; j < numEstuReprobados().length; j++) {
            System.out.println("Materia " + (j + 1) + ": " + numEstuReprobados()[j]);
        }
    }
}
