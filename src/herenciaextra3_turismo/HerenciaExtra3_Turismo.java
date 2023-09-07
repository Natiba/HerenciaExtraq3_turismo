package herenciaextra3_turismo;

import Entity.Camping;
import Entity.Hotel;
import Entity.Hotel4;
import Entity.Hotel5;
import Entity.Residencia;
import Entity.Turismo;
import Service.Hotel4Service;
import Service.Hotel5Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HerenciaExtra3_Turismo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Turismo> listadoAlojamientos = new ArrayList<>(); // quiero guardar aca Todos los alojamientos
        // Hotel4 hot4 = new Hotel4();
        ArrayList<Hotel> listadoHoteles = new ArrayList<>();
        Hotel4Service hot4S = new Hotel4Service();
        Hotel5Service hot5S = new Hotel5Service();

        Hotel4 hot4 = new Hotel4("A", "xx", 44, 8, 12, 4, 1020, "Hotel4_1", "ll", "kjhh", "Carme");
        Hotel5 hot5 = new Hotel5(6, 4, 7, "A", "xx", 44, 8, 12, 4, 365, "Hotel5_1", "ll", "kjhh", "Carme");
        Hotel4 hot44 = new Hotel4("B", "xx", 44, 8, 12, 4, 145, "Hotel4_2", "ll", "kjhh", "Carme");
        Hotel5 hot55 = new Hotel5(6, 4, 7, "B", "xx", 44, 8, 12, 4, 65, "Hotel5_2", "ll", "kjhh", "Carme");

        listadoHoteles.add(hot4);
        listadoHoteles.add(hot5);
        listadoHoteles.add(hot44);
        listadoHoteles.add(hot55);
        listadoAlojamientos.add(hot4);
        listadoAlojamientos.add(hot5);
        listadoAlojamientos.add(hot44);
        listadoAlojamientos.add(hot55);

        System.out.println(hot4.toString());
        System.out.println(hot5.toString());
        System.out.println(hot44.toString());
        System.out.println(hot55.toString());

        Camping camp1 = new Camping(40, 6, true, false, 300, "Camp1", "dfgg", "pdkd", "jshhs");
        Camping camp2 = new Camping(60, 6, false, true, 300, "Camp2", "jjjg", "pdkd", "jshhs");
        Residencia resi1 = new Residencia(4, true, false, true, 150, "Resi1", "dddn", "jdjdjd", "jdsshs");
        Residencia resi2 = new Residencia(4, false, true, false, 150, "Resi2", "dddn", "jdjdjd", "jdsshs");
        
        listadoAlojamientos.add(camp1);
        listadoAlojamientos.add(camp2);
        listadoAlojamientos.add(resi1);
        listadoAlojamientos.add(resi2);

        System.out.println(camp1.toString());
        System.out.println(camp2.toString());
        System.out.println(resi1.toString());
        System.out.println(resi2.toString());

//        System.out.println("Cuántos hoteles desea cargar en total?");
//        int hotelesCargaTotal = sc.nextInt();
//
//        for (int i = 0; i < hotelesCargaTotal; i++) {
//
//            System.out.println("Cuántos hoteles 4 estrellas desea cargar?");
//            int hoteles4 = sc.nextInt();
//
//           for (int j = 0; j < hoteles4; j++) {
//
//                hot4S.llenarHotel4(hot4);  
//               //listadoAlojamientos.add(hot4S);
//
//       }
//
//           if (hotelesCargaTotal - hoteles4 > 0) { // para evaluar si del total aun queda espacio para ingresar 5 estrellas
//
//                int restanCargar = hotelesCargaTotal - hoteles4;
//
//                for (int k = 0; k < restanCargar; k++) {
//
//                    //hot5S.llenarAlojamientos();
//                    //listadoAlojamientos.add();
//                }
//
//         }
//
//        }
//
        System.out.println("\n MENU \n");

        int opcionMenu = 0;

        do {

            System.out.println("Que desea realizar? \n");

            System.out.println("1. Ver todos los alojamientos \n"
                    + "2. Ver todos los hoteles, de más caro a más barato \n"
                    + "3. Ver todos los campings con restaurante \n"
                    + "4. Ver todos las residencias que tienen descuento \n"
                    + "5. Salir \n");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    for (Turismo alojamientos : listadoAlojamientos) {
                        System.out.println(alojamientos);
                    }
                    break;
                case 2:
//                   Collections.sort(listadoHoteles, new Comparator<Hotel>) {
//                   @Override 
//                    public int compare(Hotel o1, Hotel o2) {
//                     return t2.getPrecioHabitacion().compareTo(t1.getPrecioHabitacion());
                    
                    System.out.println(listadoHoteles);
                    

                   break;
                case 3:
                    for (Turismo alojamiento : listadoAlojamientos) {
                        if (alojamiento instanceof  Camping)  {
                            if (((Camping) alojamiento).getPoseeResto()) {
                                System.out.println("Los campings que tienen resto: " + alojamiento.getNombre() + "\n");
                            }
                        }
                    }
                    break;
                case 4:
for (Turismo alojamiento : listadoAlojamientos) {
    if (alojamiento instanceof  Residencia && ((Residencia) alojamiento).getDescuentosGremios()) {
        System.out.println("Las residencias que hacen descuentos a gremios son: " + alojamiento.getNombre() + "\n");
    }
}
                    break;
                case 5:
                    System.out.println("Gracias por visitar nuestra compañía  \n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingrese una opción correcta, por favor  \n");
            }

        } while (opcionMenu != 5);

    }

}

//Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las residencias que tienen descuento.
