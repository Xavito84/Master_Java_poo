public class Rueda {

    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda(String marca, int aro, double ancho) {
        this.fabricante = marca;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
