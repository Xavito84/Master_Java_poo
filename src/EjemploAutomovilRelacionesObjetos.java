public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSubaru= new Persona("Lucas", "Martínez ");
        Motor motorSubaru= new Motor(2.2, TipoMotor.GASOLINA);
        Automovil subaru= new Automovil("Subaru", "Impreza");

        subaru.setColor(Color.BLANCO);
        subaru.setEstaque(new Estaque());
        subaru.setMotor(motorSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub= new Rueda[5];
        for (int i=0; i< ruedasSub.length; i++){
            subaru.addRueda (new Rueda("Yokohama", 16, 7.5));;
        }



        Persona pato= new Persona("Pato", "Rodriguez");
        Automovil mazda= new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.3, TipoMotor.DIESEL));
        mazda.setEstaque(new Estaque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        Rueda [] ruedasMaz= new Rueda[5];
        for (int i=0; i<ruedasMaz.length; i++) {
            mazda.addRueda(new Rueda ("Michelin", 18,10.5));
        }



        Persona lola= new Persona("Lola", "Lucena");
        Automovil nissan= new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(4.0, TipoMotor.DIESEL),new Estaque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(lola);
        //nissan.setRuedas(ruedasNis);
       nissan.addRueda(new Rueda("Pirelli", 20,11.5))
               .addRueda(new Rueda("Pirelli", 20,11.5))
               .addRueda(new Rueda("Pirelli", 20,11.5))
               .addRueda(new Rueda("Pirelli", 20,11.5))
               .addRueda(new Rueda("Pirelli", 20,11.5));


        Rueda [] ruedasNis2= new Rueda[5];

        for (int i=0; i<ruedasNis2.length; i++) {
            ruedasNis2[i] = new Rueda ("Pirelli",20,11.5);
        }

        Persona miriam= new Persona("Miriam", "Lucena");
        Automovil nissan2= new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.5, TipoMotor.GASOLINA),new Estaque(50), lola, ruedasNis2);
        nissan2.setTipo(TipoAutomovil.PICKUP);


        Automovil.setColorPatente(Color.AZUL); //modificamos todos los colores de la patente ya que es estatico
        Automovil.setCapacidadDepositoEstatico(45);


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());









    }

}
