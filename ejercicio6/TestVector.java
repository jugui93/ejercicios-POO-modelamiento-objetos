package ejercicio6;

import java.util.Scanner;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numeros = new Vector<>();

        int num;

        do{
            System.out.print("Introduce un número ");
            num = scanner.nextInt();
            if (!numeros.contains(num)){
                numeros.add(num);
            }else{
                break;
            }
        } while (true);

        System.out.println("Números introducidos:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }

        scanner.close();
    }
}
