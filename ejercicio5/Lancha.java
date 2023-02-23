package ejercicio5;

public class Lancha extends Vehiculo{
    private int potencia;

    public Lancha(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible, int potencia) {
        super(numPasajeros, tieneTripulacion, numRuedas, fechaMatriculacion, medioDesplazamiento, marca, modelo,
                tipoCombustible);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche [Numero de Pasajeros=" + getNumPasajeros() + ", Tiene tripulacion=" + isTieneTripulacion() + ", Numero de Ruedas=" + getNumRuedas()
                + ", fecha de Matriculacion=" + getFechaMatriculacion() + ", medio de Desplazamiento=" + getMedioDesplazamiento()
                + ", potencia=" + getPotencia() + "]";
    }
    
}
