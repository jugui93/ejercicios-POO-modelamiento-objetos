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

    public double[] generarArray(int n) {
        Random random = new Random();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextDouble() * 100; // Genera un número aleatorio entre 0 y 100
        }
        System.out.println("Array generado: " + Arrays.toString(arr));
        return arr;
    }

    public void burbuja() {
        int n = this.longitud;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.arreglo[j] > this.arreglo[j + 1]) {
                    double temp = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int izq, int der) {
        double pivote = this.getArreglo()[(izq + der) / 2];
        int i = izq;
        int j = der;
        do {
            while (this.arreglo[i] < pivote) i++;
            while (this.arreglo[j] > pivote) j--;
            if (i <= j) {
                double temp = this.arreglo[i];
                this.arreglo[i] = this.arreglo[j];
                this.arreglo[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quickSort(izq, j);
        }
        if (i < der) {
            quickSort(i, der);
        }
    }

    public double[] getArreglo() {
        return arreglo;
    }

    public int getLongitud() {
        return longitud;
    }
}
