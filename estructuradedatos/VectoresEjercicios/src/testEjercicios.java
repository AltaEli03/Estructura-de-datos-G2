import javax.swing.JOptionPane;

public class testEjercicios {
    public static void main(String[] args) {
        ejecutar();
    }

    public static String menu() {
        String menu = "Menú Principal\n" +
                "1) Operaciones con Vector\n" +
                "2) Clasificación de Estudiantes\n" +
                "3) Salir\n" +
                "Elige la opción:";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion;

        while (sentinel) {
            opcion = menu();
            switch (opcion) {
                case "1":
                    realizarOperacionesConVector();
                    break;
                case "2":
                    clasificarEstudiantes();
                    break;
                case "3":
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Hasta la próxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    break;
            }
        }
    }

    private static void realizarOperacionesConVector() {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del vector:"));
        OperacionesVector operaciones = new OperacionesVector(tam);
        JOptionPane.showMessageDialog(null, operaciones.toString());
    }

    private static void clasificarEstudiantes() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes: "));
        Estudiante[] estudiantes = new Estudiante[n];

        for (int i = 0; i < n; i++) {
            estudiantes[i] = new Estudiante();
        }

        // Mostrar los puntajes generados
        StringBuilder puntajes = new StringBuilder("Puntajes generados:\n");
        for (Estudiante estudiante : estudiantes) {
            puntajes.append(estudiante.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, puntajes.toString());

        // Clasificar estudiantes
        Estudiante.clasificarEstudiantes(estudiantes);
    }
}
