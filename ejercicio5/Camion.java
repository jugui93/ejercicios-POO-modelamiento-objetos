package ejercicio5;

public class Camion extends Vehiculo{
    private int capacidadCarga;

    public Camion(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible, int capacidadCarga) {
        super(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo,
                tipoCombustible);
        this.capacidadCarga = capacidadCarga;
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion [Numero de Pasajeros=" + getNumPasajeros() + ", Tiene tripulacion=" + isTieneTripulacion() + ", Numero de Ruedas=" + getNumRuedas()
                + ", fecha de Matriculacion=" + getFechaMatriculacion() + ", medio de Desplazamiento=" + getMedioDesplazamiento()
                + ", capacidad de carga=" + getCapacidadCarga() + "]";
    }
}
