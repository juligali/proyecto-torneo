public class Jugador extends Persona {

    private String posicion;
    private int numeroCamiseta;
    private String fichaMedica;
    private Equipo equipo;
// esta bn esta asociacion ?
    public Jugador(String nombre, String apellido, int edad, String email, String dni,
                   String posicion, int numeroCamiseta, String fichaMedica) {

        super(nombre, apellido, edad, email, dni);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.fichaMedica = fichaMedica;
    }

    public void transferirAEquipo(Equipo nuevoEquipo){
        this.equipo = nuevoEquipo;
    }
}