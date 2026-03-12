import java.util.ArrayList;
import java.util.List;

public class Torneo {

    private String nombre;
    private String fechaInicio;
    private String fechaFin;

    private Sede sede;
// relacion de asociacion con sede
    private List<Equipo> equipos;
    private List<Partido> partidos;
    // un torneo tiene muchos equipos y un torneo tiene muchos partidos.
    // torneo composicion con partido
    // torneo agregacion con equipo

    public Torneo(String nombre, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
    }

    public void crearTorneo(){
        System.out.println("Torneo creado");
    }

    public void modificarTorneo(){
        System.out.println("Torneo modificado");
    }

    public void asignarSede(Sede sede){
        this.sede = sede;
    }

    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
    }

    public void agregarPartido(Partido partido){
        partidos.add(partido);
    }
}
