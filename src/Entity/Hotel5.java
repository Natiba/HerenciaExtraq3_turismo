package Entity;

public final class Hotel5 extends Hotel4 {

    private Integer cantSalonesConferencia;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas) {
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadResto) {
        super(gimnasio, nombreRestaurante, capacidadResto);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadResto, Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioHabitacion) {
        super(gimnasio, nombreRestaurante, capacidadResto, cantHabitaciones, numDeCamas, cantPisos, precioHabitacion);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadResto, Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String encargado) {
        super(gimnasio, nombreRestaurante, capacidadResto, cantHabitaciones, numDeCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, encargado);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(Integer cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantHabitaciones() {
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
    public String toString() {
        return " Hotel5 { " + "\n Nombre: " + this.nombre + "\n Dirección: " + this.direccion + "\n"
                + " Localidad: " + this.localidad + "\n Encargado: " + this.encargado + "\n"
                + " Cantidad de Habitaciones: " + cantHabitaciones + "\n Número de Camas: " + numDeCamas + "\n"
                + " Cantidad de Pisos: " + cantPisos + "\n Precio de Habitaciones: " + precioHabitacion + "\n"
                + " Gimnasio: " + this.gimnasio + "\n Nombre del Restaurante: " + this.nombreRestaurante + "\n"
                + " Capacidad del Restaurante: " + capacidadResto + "\n"
                + " Cantidad de Salones de Conferencia: " + cantSalonesConferencia + "\n"
                + " Cantidad de Suites: " + cantSuites + "\n Cantidad de Limosinas: " + cantLimosinas + "\n"
                + "}\n";
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
