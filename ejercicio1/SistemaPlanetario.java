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
}