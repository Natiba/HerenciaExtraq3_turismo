package Service;

import Entity.Hotel;
import Entity.Turismo;
import java.util.Scanner;

public class HotelService extends TurismoService {

    Scanner sc;
   // Hotel hot;

    public HotelService() {

        sc = new Scanner(System.in).useDelimiter("\n");
        //hot = new Hotel();
    }

    public void llenarHoteles(Hotel hot) {
        super.llenarAlojamientos(hot);
        System.out.println("Ingrese cantidad de habitaciones, por favor");
        hot.setCantHabitaciones(sc.nextInt());
        System.out.println("Cant habit Hotel service: " + hot.getCantHabitaciones());

        System.out.println("Ingrese numero de camas, por favor");
        hot.setNumDeCamas(sc.nextInt());

        System.out.println("Ingrese cantidad de pisos, por favor");
        hot.setCantPisos(sc.nextInt());

        //System.out.println("Ingrese precio de habitaciones, por favor");

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
//características de las distintas categorías son las siguientes:
//• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
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
//Donde:
//Valor agregado por el restaurante:
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50.
//Valor agregado por el gimnasio:
//• $50 si el tipo del gimnasio es A.
//• $30 si el tipo del gimnasio es B.
//Valor agregado por las limosinas:
//• $15 por la cantidad de limosinas del hotel.
