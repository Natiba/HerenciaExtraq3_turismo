package Service;

import Entity.Turismo;
import java.util.Scanner;

public class TurismoService extends Turismo {

    Scanner sc;
   //Turismo turi;

    public TurismoService() {

        sc = new Scanner(System.in).useDelimiter("\n");
       // turi = new Turismo ();

    }
    
    public void llenarAlojamientos(Turismo turi) { //

        System.out.println("Ingrese nombre del alojamiento, por favor");
        turi.setNombre(sc.next());

        System.out.println("Ingrese dirección del alojamiento, por favor");
        turi.setDireccion(sc.next());
        
         System.out.println("Ingrese localidad del alojamiento, por favor");
        turi.setLocalidad(sc.next());
        
         System.out.println("Ingrese nombre del encargado del alojamiento, por favor");
        turi.setEncargado(sc.next());

    }
    
}

//Una compañía de promociones turísticas desea mantener información sobre la infraestructura
//de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
//acuerdo con sus posibilidades. 
//Los alojamientos se identifican por un nombre, una dirección,
//una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
//alojamientos: Hoteles y Alojamientos Extrahoteleros.

//Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las residencias que tienen descuento.
