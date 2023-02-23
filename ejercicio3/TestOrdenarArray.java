package ejercicio3;

import java.util.Scanner;

public class TestOrdenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del array: ");
        int n = scanner.nextInt();
        OrdenarArray ordenarArreglo = new OrdenarArray(n);
    }
}