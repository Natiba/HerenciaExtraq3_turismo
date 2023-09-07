package Entity;

import java.util.Comparator;
import java.util.Objects;

public class Hotel extends Turismo implements Comparator {

    protected Integer cantHabitaciones;
    protected Integer numDeCamas;
    protected Integer cantPisos;
    protected Integer precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioHabitacion) {
        this.cantHabitaciones = cantHabitaciones;
        this.numDeCamas = numDeCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel(Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numDeCamas = numDeCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getCantHabitaciones() {
        System.out.println("Estoy entregando habit " + cantHabitaciones);
        return cantHabitaciones;

    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumDeCamas() {
        return numDeCamas;
    }

    public void setNumDeCamas(Integer numDeCamas) {
        this.numDeCamas = numDeCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }





    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.precioHabitacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.precioHabitacion, other.precioHabitacion)) {
            return false;
        }
        return true;
    }
    
      //  @Override
    public int compareTo(Hotel o1, Hotel o2) {
        return o2.getPrecioHabitacion().compareTo(o1.getPrecioHabitacion());
    }
    
        @Override
    public String toString() {
        return "Hotel {" + "\n Nombre: " + this.nombre + "\n Dirección: " + this.direccion + "\n Localidad: " + this.localidad + "\n Encargado: " + this.encargado + "\n Cantidad de Habitaciones: " + cantHabitaciones + "\n Número de Camas: " + numDeCamas + "\n Cantidad de Pisos: " + cantPisos + "\n Precio de Habitaciones: " + precioHabitacion + "\n}";
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
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
