package Service;

import Entity.Hotel;
import Entity.Hotel4;
import Entity.Turismo;
import java.util.Scanner;

public class Hotel4Service extends HotelService {

    Scanner sc;
    //Hotel4 hot4;

    public Hotel4Service() {

        sc = new Scanner(System.in).useDelimiter("\n");
        //hot4 = new Hotel4();

    }

    public void llenarHotel4(Hotel4 hot4) {
        //super.llenarAlojamientos(hot4);
        super.llenarHoteles(hot4);

        System.out.println("Ingrese calificación del gimnasio (A ó B), por favor");
        hot4.setGimnasio(sc.next().toUpperCase());
        //System.out.println("El gym es " + hot4.getGimnasio());
        
        System.out.println("Ingrese nombre del restaurante, por favor");
        hot4.setNombreRestaurante(sc.next());

        System.out.println("Ingrese la capacidad del restaurante, por favor");
        hot4.setCapacidadResto(sc.nextInt());

        hot4.setPrecioHabitacion(precioHabitacion(hot4));

        System.out.println(hot4.toString());

    }

    public int valorAgregadoResto(Hotel4 hot4) { // 

        int auxCapacidadResto = hot4.getCapacidadResto();

        if (auxCapacidadResto < 30) {
            return 10;
        } else if (auxCapacidadResto <= 50) {
            return 30;
        } else {
            return 50;
        }

    }

    public int valorAgregadoGym(Hotel4 hot4) { // 

        switch (hot4.getGimnasio()) {
            case "A":
                return 50;
            case "B":
                return 30;
            default:
                return 0;
        }
    }

    public int precioHabitacion(Hotel4 hot4) { // 
        System.out.println("Cant habit da: " + hot4.getCantHabitaciones());
        System.out.println("Cant pisos da: " + hot4.getCantPisos());
        System.out.println("Valor agregado resto da: " + valorAgregadoResto(hot4));
        System.out.println("Valor agregado gym da: " + valorAgregadoGym(hot4));
        int precioHabitacion = 50 + hot4.getCantPisos() + valorAgregadoResto(hot4) + valorAgregadoGym(hot4);
        // hot4.setPrecioHabitacion(precioHabitacion);
        System.out.println("El precio de la habitacion del hotel " + hot4.getNombre() + " es de: " + precioHabitacion);
        return precioHabitacion;
        //return hot4.getPrecioHabitacion();
    }

}

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
