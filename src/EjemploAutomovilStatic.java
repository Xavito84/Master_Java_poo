public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Motor motorSubaru= new Motor(2.2, TipoMotor.GASOLINA);
        Automovil subaru= new Automovil("Subaru", "Impreza");

        subaru.setColor(Color.BLANCO);
        subaru.setEstaque(new Estaque());
        subaru.setMotor(motorSubaru);


        Automovil mazda= new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.3, TipoMotor.DIESEL));
        //mazda.setEstaque(new Estaque());
        Automovil nissan= new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(4.0, TipoMotor.DIESEL),new Estaque(50));
        Automovil nissan2= new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.5, TipoMotor.GASOLINA),new Estaque(50));

        Automovil seat = new Automovil("Seat", "Ibiza", Color.NARANJA, new Motor(2.8, TipoMotor.DIESEL) ,new Estaque(60), TipoAutomovil.SEDAN);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.AZUL); //modificamos todos los colores de la patente ya que es estatico
        Automovil.setCapacidadDepositoEstatico(45);


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println(seat.verDetalle());


        System.out.println("Automovil.getColorPatente(): "+ Automovil.getColorPatente());
        System.out.println("kilometos por litros: "+ Automovil.calcularConsumoEstatico(300,60));

        System.out.println(mazda.calcularConsumo(300,70));



    }

}
