package ejercicio1;
import java.util.ArrayList;

/**
 * SistemaPlanetario
 */
public class SistemaPlanetario {

    private static final double G = 6.6743e-11; // Constante de gravitación universal
    private ArrayList<CuerpoCeleste> cuerpos;

    public SistemaPlanetario() {
        this.cuerpos = new ArrayList<>();
    }
    
    public void agregarCuerpo(CuerpoCeleste cuerpo) {
        cuerpos.add(cuerpo);
    }

    public void eliminarCuerpo(CuerpoCeleste cuerpo) {
        cuerpos.remove(cuerpo);
    }

    public double calcularAtraccionGravitatoria(CuerpoCeleste cuerpo1, CuerpoCeleste cuerpo2) {
        double distancia = cuerpo1.calcularDistancia(cuerpo2);
        double masa1 = cuerpo1.getMasa();
        double masa2 = cuerpo2.getMasa();
        return G * masa1 * masa2 / (distancia * distancia);
    }

    public void displayCuerpos() {
        for (CuerpoCeleste cuerpo : cuerpos) {
            System.out.println("Nombre: " + cuerpo.getNombre());
            System.out.println("ID: " + cuerpo.getId());
            System.out.println("Masa: " + cuerpo.getMasa() + " kg");
            System.out.println("Densidad: " + cuerpo.getDensidad() + " kg/m^3");
            System.out.println("Diámetro: " + cuerpo.getDiametro() + " m");
            System.out.println("Distancia al sol: " + cuerpo.getDistanciaAlSol() + " m");
            System.out.println("--------------------");
        }
    }
}