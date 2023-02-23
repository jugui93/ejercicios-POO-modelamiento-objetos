package ejercicio5;

public class Coche extends Vehiculo{

    private int numPuertas;

    public Coche(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible, int numPuertas) {
        super(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo,
                tipoCombustible);
        this.numPuertas = numPuertas;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche [Numero de Pasajeros=" + getNumPasajeros() + ", Tiene tripulacion=" + isTieneTripulacion() + ", Numero de Ruedas=" + getNumRuedas()
                + ", fecha de Matriculacion=" + getFechaMatriculacion() + ", medio de Desplazamiento=" + getMedioDesplazamiento()
                + ", numero de puertas=" + getNumPuertas() + "]";
    }
}
