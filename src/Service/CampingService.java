package Service;

import Entity.Alojamiento;
import Entity.Camping;
import Entity.Turismo;
import java.util.Scanner;

public class CampingService extends AlojamientoService {
    
    Scanner sc;
    Camping camping;

    public CampingService() {
        sc = new Scanner(System.in).useDelimiter("/n");
        camping = new Camping ();
    }

    public void llenarAlojamientos(Camping camping) { //
        super.llenarAlojamientos(camping); 
        
        System.out.println("Ingrese cantidad máxima de carpas, por favor");
        camping.setMaxCarpas(sc.nextInt());
        
        System.out.println("Ingrese cantidad de baños, por favor");
        camping.setCantBanios(sc.nextInt());
        
        System.out.println("Indique si posee Restaurante, por favor");
        camping.setPoseeResto(sc.nextBoolean());
        
        System.out.println(camping.toString());
        
    }

    
}
