public class Automovil implements Comparable<Automovil>{

    //atributos
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estaque estaque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;


    private TipoAutomovil tipo = TipoAutomovil.SEDAN;
    //atributos staticos
    private static int capacidadDepositoEstatico = 50;
    private static Color colorPatente = Color.NARANJA;
    private static int ultimoID;
    //atributos final, han de ser publicas y estaticas
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;

   /* public static final Color COLOR_ROJO= Color.ROJO;
    public static final Color COLOR_AMARILLO= Color.AMARILLO;
    public static final Color COLOR_AZUL= Color.AZUL;
    public static final Color COLOR_BLANCO= Color.BLANCO;
    public static final Color COLOR_GRIS=Color.GRIS;
    public static final Color COLOR_NARANJA= Color.NARANJA;*/

    //Constructores
    public Automovil() {
        this.id = ++ultimoID;
        this.ruedas= new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;

    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estaque estaque) {
        this(fabricante, modelo, color, motor);
        this.estaque = estaque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estaque estaque, TipoAutomovil tipo) {
        this(fabricante, modelo, color, motor, estaque);
        this.tipo = tipo;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estaque estaque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estaque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    //Getters and Setters

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estaque getEstaque() {
        if (estaque == null) {
            this.estaque = new Estaque(); //se pone uno por defecto si no lo tiene en la clase main asi no da error nullPointerException
        }
        return estaque;
    }

    public void setEstaque(Estaque estaque) {
        this.estaque = estaque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadDepositoEstatico() {
        return capacidadDepositoEstatico;
    }

    public static void setCapacidadDepositoEstatico(int capacidadDepositoEstatico) {
        Automovil.capacidadDepositoEstatico = capacidadDepositoEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    public Automovil addRueda(Rueda rueda) {
        if (indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;

    }

    //Metodos

    public String verDetalle() {

        String detalle = "auto.id= " + this.id +
                "\nauto.fabricante= " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();
        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }

        detalle += "\nauto.color = " + this.color +
                "\nauto.colorPatente= " + colorPatente;
        if (this.getMotor() != null) {
            detalle += "\nauto.cilindrada= " + this.motor.getCilindrada();
        }
        if (conductor != null) {
            detalle += "\nConductor= " + this.getConductor();
        }

        if (getRuedas() != null) {
            detalle += "\nRuedas del automóvil:";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }
        }

        detalle += "\n";
        return detalle;

    }

    public String acelerar(int rpm) {
        return "el auto " + this.getFabricante() + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.getFabricante() + " " + this.getModelo() + " esta frenado!!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public double calcularConsumo(int km, double porcentajeGasolina) {
        return km / (porcentajeGasolina * this.getEstaque().getCapacidad());
    }

    //sobrecarga de metodo (principio de encapsulamiento)
    public double calcularConsumo(int km, int porcentajeGasolina) {
        return km / (this.getEstaque().getCapacidad() * (porcentajeGasolina / 100.0));//si lo haces asi no puedes poner 100 has de ponerlo como decimal sino da error.
    }

    public static double calcularConsumoEstatico(int km, int porcentajeGasolina) {
        return km / (capacidadDepositoEstatico * (porcentajeGasolina / 100.0));//metodo static solo permite atributos estaticos
    }


    //SobreEscribir metodo de la clase padre. Polimorfismo
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj; // hacemos uns cast porque viene de automovil y recibe un objeto

        return (this.fabricante != null && this.fabricante.equals(a.getFabricante()) && this.modelo != null && this.modelo.equals(a.getModelo())); // ponemos el disto y el and para que sea mas robusto y no salte un pointexceptionnull

    }

    @Override
    public String toString() {
        return this.id + " : "+ fabricante+" "+ modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
