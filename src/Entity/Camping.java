package Entity;

public class Camping extends Alojamiento {
    
    protected Integer maxCarpas;
    protected Integer cantBanios;
    protected Boolean poseeResto;

    public Camping() {
    }

    public Camping(Integer maxCarpas, Integer cantBanios, Boolean poseeResto) {
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeResto = poseeResto;
    }

    public Camping(Integer maxCarpas, Integer cantBanios, Boolean poseeResto, Boolean privado, Integer mt2) {
        super(privado, mt2);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeResto = poseeResto;
    }

    public Camping(Integer maxCarpas, Integer cantBanios, Boolean poseeResto, Boolean privado, Integer mt2, String nombre, String direccion, String localidad, String encargado) {
        super(privado, mt2, nombre, direccion, localidad, encargado);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeResto = poseeResto;
    }

    public Integer getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(Integer maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getPoseeResto() {
        return poseeResto;
    }

    public void setPoseeResto(Boolean poseeResto) {
        this.poseeResto = poseeResto;
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
        return " Camping {" + "\n Nombre: " + nombre + "\n Dirección: " + direccion + "\n "
+ "Localidad: " + localidad + "\n Encargado: " + encargado + "\n Maximo de Carpas: " + maxCarpas + "\n "
+ "Cantidad de Baños: " + cantBanios + "\n"
                + " Posee Resto? " + poseeResto + "\n}\n";
    }
   
}

//Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones.