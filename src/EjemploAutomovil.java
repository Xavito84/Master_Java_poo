public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru= new Motor(2.2, TipoMotor.GASOLINA);
        Automovil subaru= new Automovil("Subaru", "Impreza");

        subaru.setColor(Color.BLANCO);
        subaru.setEstaque(new Estaque());
        subaru.setMotor(motorSubaru);


        Automovil mazda= new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.3, TipoMotor.DIESEL));
        mazda.setEstaque(new Estaque(45));
        Automovil nissan= new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(4.0, TipoMotor.DIESEL),new Estaque(50));
        Automovil nissan2= new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.5, TipoMotor.GASOLINA),new Estaque(50));

        Automovil seat = new Automovil("Seat", "Ibiza", Color.NARANJA, new Motor(2.8, TipoMotor.DIESEL) ,new Estaque(60));

        System.out.println("mazda.fabricante= "+mazda.getFabricante());
        System.out.println();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println(subaru.acelerar(3000));
        System.out.println(mazda.frenar());

        System.out.println(subaru.acelerarFrenar(4000));


        System.out.println(mazda.calcularConsumo(300, 0.6));
        System.out.println(subaru.calcularConsumo(300, 60));
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println(seat.verDetalle());
        System.out.println(nissan.calcularConsumo(300,60));

        System.out.println("son iguales los nissan? "+ (nissan== nissan2));
        System.out.println("son iguales los nissan con equals? "+ (nissan.equals(nissan2)));

        System.out.println(nissan.toString());

    }

}
