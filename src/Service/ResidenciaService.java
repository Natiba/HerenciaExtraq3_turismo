package Service;

import Entity.Residencia;
import Entity.Turismo;
import java.util.Scanner;

public class ResidenciaService extends AlojamientoService {

    Residencia resi;

    public ResidenciaService() {
        sc = new Scanner(System.in).useDelimiter("/n");
        resi = new Residencia ();
    }

    public void llenarAlojamientos(Residencia resi) { // 
        super.llenarAlojamientos(resi); // 

        System.out.println("Ingrese cantidad de habitaciones, por favor");
        resi.setCantHabitaciones(sc.nextInt());

        System.out.println("Indique si posee descuentos a gremios, por favor");
        resi.setDescuentosGremios(sc.nextBoolean());

        System.out.println("Indique si posee campo de deportes, por favor");
        resi.setCampoDeportivo(sc.nextBoolean());
        
        System.out.println(resi.toString());

    }

}
