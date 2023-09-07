package Service;

import Entity.Hotel;
import Entity.Hotel4;
import Entity.Hotel5;
import Entity.Turismo;
import java.util.Scanner;

public class Hotel5Service extends Hotel4Service {

    Scanner sc;
    //Hotel5 hot5;
    
    public Hotel5Service() {
      sc = new Scanner(System.in).useDelimiter("\n");
     //hot5 = new Hotel5();
    }

    public int precioHabitacion(Hotel5 hot5) {
        return super.precioHabitacion(hot5) + (hot5.getCantLimosinas() * 15);

    }

    public void llenarAlojamientos(Hotel5 hot5) { // 
        super.llenarAlojamientos(hot5);

        System.out.println("Ingrese cantidad de salones de conferencia, por favor");
        hot5.setCantSalonesConferencia(sc.nextInt());

        System.out.println("Ingrese cantidad de suites, por favor");
        hot5.setCantSuites(sc.nextInt());

        System.out.println("Ingrese cantidad de limosinas, por favor");
        hot5.setCantLimosinas(sc.nextInt());

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
//Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
//acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
//cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
//será.
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
