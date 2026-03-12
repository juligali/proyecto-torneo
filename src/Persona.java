public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String email;
    protected String dni;

    public Persona(String nombre, String apellido, int edad, String email, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.dni = dni;
    }
}