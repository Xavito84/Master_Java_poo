public enum TipoAutomovil {
    SEDAN ("Sedan","Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK ("Hatchback", "Auto compacto", 5),
    PICKUP ("PICKUP", "Camioneta", 4),
    COUPE ("Coupe", "Auto pequeño", 2),
    CONVERTIBLE ("Convertible", "Auto deportivo" , 2),
    FURGON ( "Furgón", "Auto utlilitario", 3),
    SUV( "SUV", "Todoterreno deportivo", 5);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
