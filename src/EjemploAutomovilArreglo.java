import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {



        Persona conductorSubaru= new Persona("Lucas", "Martínez ");
        Motor motorSubaru= new Motor(2.2, TipoMotor.GASOLINA);
        Automovil subaru= new Automovil("Subaru", "Impreza");

        subaru.setColor(Color.BLANCO);
        subaru.setEstaque(new Estaque());
        subaru.setMotor(motorSubaru);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);




        Persona pato= new Persona("Pato", "Rodriguez");
        Automovil mazda= new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.3, TipoMotor.DIESEL));
        mazda.setEstaque(new Estaque());
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);




        Persona lola= new Persona("Lola", "Lucena");
        Automovil nissan= new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(4.0, TipoMotor.DIESEL),new Estaque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(lola);



        Persona miriam= new Persona("Miriam", "Lucena");
        Automovil suzuki= new Automovil("Suzuki", "Vitara", Color.AZUL, new Motor(1.6, TipoMotor.GASOLINA),new Estaque(50));
        suzuki.setTipo(TipoAutomovil.SUV);
        suzuki.setConductor(miriam);


        Automovil audi=new Automovil("Audi", "A3" );
        audi.setConductor(new Persona("Joanna", "Muñoz"));

        Automovil[] autos= new Automovil[5];
        autos[0]= subaru;
        autos[1]=mazda;
        autos[2]= nissan;
        autos[3]= suzuki;
        autos[4]= audi;


        Arrays.sort(autos);//para ordenar pero antes hay que implementar implements Comparable<Automovil> y el metodo compareTo
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }

}
