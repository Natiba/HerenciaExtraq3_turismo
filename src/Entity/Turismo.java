
package Entity;

public class Turismo {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String encargado;

    public Turismo() {
    }

    public Turismo(String nombre, String direccion, String localidad, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
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
    public String toString() {
        return "Turismo {" + "\n Nombre: " + nombre + "\n Dirección: " + direccion + "\n Localidad: " + localidad + "\n Encargado: " + encargado + "\n}";
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