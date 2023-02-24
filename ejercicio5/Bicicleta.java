package ejercicio5;

public class Bicicleta extends Vehiculo{
    private int numeroMarchas;

    public Bicicleta(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible, int numeroMarchas) {
        super(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo,
                tipoCombustible);
        this.numeroMarchas = numeroMarchas;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public String toString() {
        return "Bicicleta [Numero de Pasajeros=" + getNumPasajeros() + ", Tiene tripulacion=" + isTieneTripulacion() + ", Numero de Ruedas=" + getNumRuedas()
                + ", fecha de Matriculacion=" + getFechaMatriculacion() + ", medio de Desplazamiento=" + getMedioDesplazamiento()
                + ", numero de marchas=" + getNumeroMarchas() + "]";
    }

}
