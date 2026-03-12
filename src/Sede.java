public class Sede {

    private String nombre;
    private Direccion direccion;
// direccion y sede son composicion
    public Sede(String nombre, String calle, int numero, String ciudad) {
        this.nombre = nombre;
        this.direccion = new Direccion(calle, numero, ciudad);
    }

    public Direccion getDireccion() {
        return direccion;
    }


}