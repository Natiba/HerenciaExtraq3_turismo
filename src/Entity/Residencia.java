package Entity;

public class Residencia extends Alojamiento {

    protected Integer cantHabitaciones;
    protected Boolean descuentosGremios;
    protected Boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, Boolean descuentosGremios, Boolean campoDeportivo) {
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(Integer cantHabitaciones, Boolean descuentosGremios, Boolean campoDeportivo, Boolean privado, Integer mt2) {
        super(privado, mt2);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(Integer cantHabitaciones, Boolean descuentosGremios, Boolean campoDeportivo, Boolean privado, Integer mt2, String nombre, String direccion, String localidad, String encargado) {
        super(privado, mt2, nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(Boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMt2() {
        return mt2;
    }

    public void setMt2(Integer mt2) {
        this.mt2 = mt2;
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
        return "Residencia {" + "\n Nombre: " + nombre + "\n Dirección: " + direccion + "\n "
+ "Localidad: " + localidad + "\n Encargado: " + encargado+ "\n"
                + " Cantidad de Habitaciones: " + cantHabitaciones + "\n"
                + " Descuentos a los Gremios: " + descuentosGremios + "\n"
                + " Posee Campo Deportivo? " + campoDeportivo + "\n}";
    }

}

//Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y 
//si posee o no campo deportivo.
