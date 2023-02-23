package ejercicio1;

public class TestSistemaPlanetario {
    public static void main(String[] args) {
        SistemaPlanetario sistemaSolar = new SistemaPlanetario();
        CuerpoCeleste tierra = new CuerpoCeleste(5.972e24, 5.52, 6371e3, 149.6e12, "tierra");
        CuerpoCeleste marte = new CuerpoCeleste(6.39e23, 3.93, 3389e3, 227.9e12, "marte");

        sistemaSolar.agregarCuerpo(marte);
        sistemaSolar.agregarCuerpo(tierra);

        sistemaSolar.displayCuerpos();
    }
}
