import java.util.ArrayList;

public class CalificacionesHoteles {
    private int[][] calificaciones;

    public CalificacionesHoteles(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int[] hotelesCincoEstrellasUnaVez() {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] == 5) {
                    indices.add(i);
                    break;
                }
            }
        }
        return indices.stream().mapToInt(i -> i).toArray();
    }

    public double calificacionPromedio() {
        double total = 0;
        int count = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                total += calificaciones[i][j];
                count++;
            }
        }
        return total / count;
    }

    public void imprimirHotelesCincoEstrellasCadaAno() {
        System.out.println("Hoteles que ganaron cinco estrellas cada año:");
        for (int i = 0; i < calificaciones.length; i++) {
            boolean siempreCincoEstrellas = true;
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] != 5) {
                    siempreCincoEstrellas = false;
                    break;
                }
            }
            if (siempreCincoEstrellas) {
                System.out.println("Hotel " + i);
            }
        }
    }

    public boolean alMenosUnHotelCincoEstrellas() {
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimir() {
        System.out.println("Promedio de calificaciones: " + calificacionPromedio());
        int[] hotelesCincoEstrellas = hotelesCincoEstrellasUnaVez();
        System.out.println("Hoteles que ganaron cinco estrellas al menos una vez:");
        for (int i : hotelesCincoEstrellas) {
            System.out.println("Hotel " + i);
        }
        imprimirHotelesCincoEstrellasCadaAno();
        System.out.println("¿Al menos un hotel ganó cinco estrellas en algún momento? " + alMenosUnHotelCincoEstrellas());
    }
}
