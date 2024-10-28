import java.util.Random;

public class testCalEstudiantes {
    public static void main(String[] args) {
        int Alumnos = 5;
        int Materias = 6;
        double[][] matriz = generarValoresAleatorios(Alumnos, Materias);
        CalEstudiantes c1 = new CalEstudiantes(matriz);
        c1.imprimir();
    }

    public static double[][] generarValoresAleatorios(int Alumnos, int Materias) {
        double[][] matriz = new double[Alumnos][Materias];
        Random rand = new Random();
        for (int i = 0; i < Alumnos; i++) {
            for (int j = 0; j < Materias; j++) {
                matriz[i][j] = rand.nextDouble() * 10;
            }
        }
        return matriz;
    }
}
