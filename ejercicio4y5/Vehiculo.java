package ejercicio4y5;

public class Vehiculo {
    private int numPasajeros;
    private boolean tieneTripulacion;
    private int numRuedas;
    private String fechaMatriculacion;
    private String medioDesplazamiento;
    private String marca;
    private String modelo;
    private String tipoCombustible;

    
    public Vehiculo(int numPasajeros, boolean tieneTripulacion, int numRuedas, String fechaMatriculacion,
            String medioDesplazamiento, String marca, String modelo, String tipoCombustible) {
        this.numPasajeros = numPasajeros;
        this.tieneTripulacion = tieneTripulacion;
        this.numRuedas = numRuedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.medioDesplazamiento = medioDesplazamiento;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    public boolean isTieneTripulacion() {
        return tieneTripulacion;
    }
    public void setTieneTripulacion(boolean tieneTripulacion) {
        this.tieneTripulacion = tieneTripulacion;
    }
    public int getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }
    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }
    public String getMedioDesplazamiento() {
        return medioDesplazamiento;
    }
    public void setMedioDesplazamiento(String medioDesplazamiento) {
        this.medioDesplazamiento = medioDesplazamiento;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

}
