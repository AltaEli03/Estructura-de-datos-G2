import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OperacionesVector {
    private int[] vector;

    // Constructor que inicializa el vector con números aleatorios
    public OperacionesVector(int tam) {
        vector = new int[tam];
        Random rand = new Random();
        for (int i = 0; i < tam; i++) {
            vector[i] = rand.nextInt(30) + 1; // Números entre 1 y 30
        }
    }

    // Método para obtener el número máximo del vector
    public int obtenerMaximo() {
        int max = vector[0];
        for (int num : vector) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Método para obtener el número mínimo del vector
    public int obtenerMinimo() {
        int min = vector[0];
        for (int num : vector) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Método para obtener la media del vector
    public double obtenerMedia() {
        double suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return suma / vector.length;
    }

    // Método para obtener la moda del vector
    public int obtenerModa() {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : vector) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        int moda = vector[0];
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entrada : frecuencia.entrySet()) {
            if (entrada.getValue() > maxFrecuencia) {
                maxFrecuencia = entrada.getValue();
                moda = entrada.getKey();
            }
        }
        return moda;
    }

    // Método para obtener la mediana del vector
    public double obtenerMediana() {
        int[] copia = vector.clone();
        Arrays.sort(copia);
        int n = copia.length;
        if (n % 2 == 0) {
            return (copia[n / 2 - 1] + copia[n / 2]) / 2.0;
        } else {
            return copia[n / 2];
        }
    }

    // Método para obtener la frecuencia de números del 1 al 10
    public String obtenerFrecuencia() {
        int[] frecuencia = new int[10]; // Solo para contar del 1 al 10
        for (int num : vector) {
            if (num >= 1 && num <= 10) {
                frecuencia[num - 1]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            double porcentaje = (frecuencia[i] * 100.0) / vector.length;
            sb.append(String.format("Cantidades de %d = %d, Porcentaje de %d = %.1f%%%n", (i + 1), frecuencia[i], (i + 1), porcentaje));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Vector original
        sb.append("Vector Original\n");
        sb.append(Arrays.toString(vector).replaceAll("[\\[\\],]", "")).append("\n");
        // Vector ordenado
        int[] vectorOrdenado = vector.clone();
        Arrays.sort(vectorOrdenado);
        sb.append("Vector Ordenado\n");
        sb.append(Arrays.toString(vectorOrdenado).replaceAll("[\\[\\],]", "")).append("\n");
        // Estadísticas
        sb.append("Numero mas Alto= ").append(obtenerMaximo()).append("\n");
        sb.append("Numero mas Bajo= ").append(obtenerMinimo()).append("\n");
        sb.append("Media Aritmetica= ").append(obtenerMedia()).append("\n");
        sb.append("Moda= ").append(obtenerModa()).append("\n");
        sb.append("Mediana= ").append(obtenerMediana()).append("\n");
        sb.append(obtenerFrecuencia());
        return sb.toString();
    }
}
