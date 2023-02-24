package ejercicio5;

public class Moto extends Vehiculo {
    private boolean scooter;

    public Moto(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible, boolean scooter) {
        super(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo,
                tipoCombustible);
        this.scooter = scooter;
    }


    public boolean isScooter() {
        return scooter;
    }

    public void setScooter(boolean scooter) {
        this.scooter = scooter;
    }

    @Override
    public String toString() {
        return "Moto [Numero de Pasajeros=" + getNumPasajeros() + ", Tiene tripulacion=" + isTieneTripulacion() + ", Numero de Ruedas=" + getNumRuedas()
                + ", fecha de Matriculacion=" + getFechaMatriculacion() + ", medio de Desplazamiento=" + getMedioDesplazamiento()
                + ", Es scooter=" + isScooter() + "]";
    }
    
}
