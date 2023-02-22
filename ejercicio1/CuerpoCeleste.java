package ejercicio1;

public class CuerpoCeleste {
    private double masa; //masa en kilogramos
    private double densidad;//kilogramos/m^3
    private double diametro;//metros
    private double distanciaAlSol;//metros
    private int id;
    private String nombre;

    public CuerpoCeleste(double masa, double densidad, double diametro, double distanciaAlSol, int id, String nombre) {
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.id = id;
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }
    
    public double calcularDistancia(CuerpoCeleste otroCuerpo) {
        return Math.abs(this.distanciaAlSol - otroCuerpo.distanciaAlSol);
    }
    
}
