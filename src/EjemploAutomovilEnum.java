public class EjemploAutomovilEnum {
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
        mazda.setTipo(TipoAutomovil.PICKUP);

        TipoAutomovil tipo= subaru.getTipo();
        System.out.println("Tipo Subaru: "+ tipo.getNombre());
        System.out.println("Tipo desc. subaru: "+ tipo.getDescripcion());

        tipo= mazda.getTipo();


        switch (tipo){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");

            case COUPE->
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");

            case FURGON->
                System.out.println("Es un automovil utilitario de transporte , de empresas");

            case HATCHBACK->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");

            case PICKUP->
                System.out.println("Es un automovil de doble cabina o camioneta");

            case SEDAN->
                System.out.println("Es un automovil mediano");

            case STATION_WAGON->
                System.out.println("Es un automovil más grande, con maletero grande");

        }

        TipoAutomovil[] tipos= TipoAutomovil.values();
        for (TipoAutomovil tipoAuto : tipos){
            System.out.println(tipoAuto+ " => "+ tipoAuto.name()+ ", "+ tipoAuto.getNombre()+", "+ tipoAuto.getDescripcion()+ ", número de puertas: "+ tipoAuto.getNumeroPuertas());
            System.out.println();
        }



    }

}
