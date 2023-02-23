package ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class OrdenarArray {
    private int longitud;
    private double[] arreglo;

    public OrdenarArray(int longitud) {
        this.longitud = longitud;
        this.arreglo = generarArray(longitud);
    }

    public static double[] generarArray(int n) {
        Random random = new Random();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextDouble() * 100; // Genera un número aleatorio entre 0 y 100
        }
        System.out.println("Array generado: " + Arrays.toString(arr));
        return arr;
    }

    public static void burbuja(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public double[] getArreglo() {
        return arreglo;
    }
}
