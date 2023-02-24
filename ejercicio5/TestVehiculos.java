package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestVehiculos {

    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca los datos del vehículo #" + i);
            System.out.println("Tipo de vehículo (1=Camión, 2=Bicicleta, 3=Lancha, 4=Coche, 5=Moto): ");
            int tipo = scanner.nextInt();
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

            switch (tipo) {
                case 1:
                    System.out.println("Capacidad de carga (toneladas): ");
                    int capacidadCarga = scanner.nextInt();
                    vehiculos.add(new Camion(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion,
                            medioDesplazamiento,marca, modelo, tipoCombustible, capacidadCarga));
                    break;
                case 2:
                    System.out.println("Número de marchas: ");
                    int numMarchas = scanner.nextInt();
                    vehiculos.add(new Bicicleta(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion,
                            medioDesplazamiento,marca, modelo, tipoCombustible, numMarchas));
                    break;
                case 3:
                    System.out.println("Potencia del motor (caballos de fuerza): ");
                    int potencia = scanner.nextInt();
                    vehiculos.add(new Lancha(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion,
                            medioDesplazamiento,marca, modelo, tipoCombustible, potencia));
                    break;
                case 4:
                    System.out.println("Numero de puertas: ");
                    int numPuertas = scanner.nextInt();
                    vehiculos.add(new Coche(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion,
                            medioDesplazamiento,marca, modelo, tipoCombustible, numPuertas));
                    break;
                case 5:
                    System.out.println("La moto es de tipo scooter (true/false): ");
                    boolean scooter = scanner.nextBoolean();
                    vehiculos.add(new Moto(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion,
                            medioDesplazamiento,marca, modelo, tipoCombustible, scooter));
                    break;
                default:
                    System.out.println("Tipo de vehículo no válido");
                    break;
            }

        }

        System.out.println("\nListado de vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

        scanner.close();
    }    
}
