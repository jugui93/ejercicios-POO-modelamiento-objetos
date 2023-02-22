package ejercicio1;
import java.util.List;

/**
 * SistemaPlanetario
 */
public class SistemaPlanetario {

    private static final double G = 6.6743e-11; // Constante de gravitación universal
    private List<CuerpoCeleste> cuerpos;
    
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
}