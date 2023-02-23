package ejercicio4y5;

public class Coche extends Vehiculo{

    private int numPuertas;

    public Coche(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible, int numPuertas) {
        super(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo,
                tipoCombustible);
        this.numPuertas = numPuertas;
    }
    
}
