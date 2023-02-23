package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehiculo {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Vehículo #" + (i+1));
            System.out.print("Número de pasajeros: ");
            int numPasajeros = scanner.nextInt();

            System.out.print("¿Tiene tripulación? (true/false): ");
            boolean tieneTripulacion = scanner.nextBoolean();

            System.out.print("Número de ruedas: ");
            int numRuedas = scanner.nextInt();

            System.out.print("Fecha de matriculación: ");
            String fechaMatriculacion = scanner.next();

            System.out.print("Medio de desplazamiento: ");
            String medioDesplazamiento = scanner.next();

            System.out.print("Marca: ");
            String marca = scanner.next();

            System.out.print("Modelo: ");
            String modelo = scanner.next();

            System.out.print("Tipo de combustible: ");
            String tipoCombustible = scanner.next();

            vehiculos.add(new Vehiculo(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo, tipoCombustible));
        }

        System.out.println("\nVehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }    
}
