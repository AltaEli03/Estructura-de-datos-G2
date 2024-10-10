import java.util.Random;

public class Estudiante {
    private int puntaje;

    public Estudiante() {
        Random rand = new Random();
        this.puntaje = rand.nextInt(21);
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Estudiante con puntaje: " + puntaje;
    }

    public static void clasificarEstudiantes(Estudiante[] estudiantes) {
        int deficientes = 0, regulares = 0, buenos = 0, excelentes = 0;

        for (Estudiante estudiante : estudiantes) {
            int puntaje = estudiante.getPuntaje();
            if (puntaje <= 5) {
                deficientes++;
            } else if (puntaje <= 10) {
                regulares++;
            } else if (puntaje <= 15) {
                buenos++;
            } else {
                excelentes++;
            }
        }

        String resultado = "Deficientes: " + deficientes + "\nRegulares: " + regulares + "\nBuenos: " + buenos + "\nExcelentes: " + excelentes;
        javax.swing.JOptionPane.showMessageDialog(null, resultado);
    }
}
