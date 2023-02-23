package ejercicio3;

import java.util.Scanner;

public class TestOrdenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del array: ");
        int n = scanner.nextInt();
        OrdenarArray ordenarArreglo = new OrdenarArray(n);
        System.out.print("Ingrese el tipo de ordenamiento (1: Burbuja, 2: QuickSort): ");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            ordenarArreglo.burbuja(ordenarArreglo.getArreglo());
        } else if (tipo == 2) {
            ordenarArreglo.quickSort(ordenarArreglo.getArreglo(), 0, n - 1);
        } else {
            System.out.println("Tipo de ordenamiento inválido.");
            return;
        }
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}