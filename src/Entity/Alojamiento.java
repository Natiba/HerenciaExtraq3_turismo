package Entity;

public class Alojamiento extends Turismo {
    
    protected Boolean privado;
    protected Integer mt2;

    public Alojamiento() {
    }

    public Alojamiento(Boolean privado, Integer mt2) {
        this.privado = privado;
        this.mt2 = mt2;
    }

    public Alojamiento(Boolean privado, Integer mt2, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.mt2 = mt2;
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
        return "Alojamiento Extrahotelero {" + "\n Es privado? " + privado + "\n mt2: " + mt2 + "\n}";
    }
    
}

//En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
//hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
//Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
//cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
//Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo. Realizar un programa en el que se representen todas las relaciones
//descriptas.