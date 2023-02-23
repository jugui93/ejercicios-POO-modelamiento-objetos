package ejercicio1;

public class CuerpoCeleste {
    private double masa; //masa en kilogramos
    private double densidad;//kilogramos/m^3
    private double diametro;//metros
    private double distanciaAlSol;//metros
    private int id;
    public static int nextId = 0;
    private String nombre;

    public CuerpoCeleste(double masa, double densidad, double diametro, double distanciaAlSol, String nombre) {
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.id = nextId;
        nextId++;
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }
    
    public double calcularDistancia(CuerpoCeleste otroCuerpo) {
        return Math.abs(this.distanciaAlSol - otroCuerpo.distanciaAlSol);
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        CuerpoCeleste.nextId = nextId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
