package Service;

import Entity.Alojamiento;
import Entity.Turismo;
import java.util.Scanner;

public class AlojamientoService extends TurismoService {
    
      Scanner sc;

    public AlojamientoService() {
        
         sc = new Scanner(System.in).useDelimiter("\n");
        
    }

    public void llenarAlojamientos(Alojamiento aloja) {
        super.llenarAlojamientos(aloja); 
        
        System.out.println("Este alojamient es privado?");   
        aloja.setPrivado(sc.nextBoolean());
        
        System.out.println("Ingrese cantidad de metros 2");
        aloja.setMt2(sc.nextInt());

    }
      
      
    
}
