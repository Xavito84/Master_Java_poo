public enum Color {
    ROJO ("Rojo"),
    AMARILLO ("Amarillo"),
    AZUL ("Azul"),
    BLANCO ("Blanco"),
    GRIS ("Gris Oscuro"),
    NARANJA ("Naranja"),;

    private final String color;


    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    // para que a la hora de imprimir lo imprime en minuscula
    public String toString() {
        return this.color;
    }
}
